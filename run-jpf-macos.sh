#!/bin/sh
set -eu

repo_dir=$(CDPATH= cd -- "$(dirname -- "$0")" && pwd)
config_file=${1:?Usage: ./run-jpf-macos.sh path/to/YourConfig.jpf}
java8_home=${JAVA8_HOME:-"$repo_dir/.spf-tools/amazon-corretto-8.jdk/Contents/Home"}

case "$(uname -m)" in
  arm64) z3_name=z3-5.1.0-arm64-osx-13.3 ;;
  x86_64) z3_name=z3-5.1.0-x64-osx-13.3 ;;
  *) echo "Unsupported macOS architecture: $(uname -m)" >&2; exit 1 ;;
esac
z3_home=${Z3_HOME:-"$repo_dir/.spf-tools/$z3_name/bin"}

if [ ! -x "$java8_home/bin/java" ] || [ ! -f "$z3_home/libz3java.dylib" ]; then
  echo "Run ./setup-spf-macos.sh first." >&2
  exit 1
fi
if [ ! -f "$config_file" ]; then
  echo "JPF configuration not found: $config_file" >&2
  exit 1
fi

if otool -L "$z3_home/libz3java.dylib" | grep -q '^[[:space:]]*libz3\.dylib'; then
  install_name_tool -change libz3.dylib @loader_path/libz3.dylib "$z3_home/libz3java.dylib"
fi

site_file=$(mktemp "${TMPDIR:-/tmp}/jobsportal-jpf-site.XXXXXX")
trap 'rm -f "$site_file"' EXIT
printf 'jpf-core = %s\njpf-symbc = %s\nextensions = ${jpf-core},${jpf-symbc}\n' \
  "$repo_dir/jpf/jpf-core" "$repo_dir/jpf/jpf-symbc" > "$site_file"

cd "$repo_dir"
"$java8_home/bin/java" -Xmx1024m -ea -Djava.library.path="$z3_home" \
  -jar "$repo_dir/jpf/jpf-core/build/RunJPF.jar" "+site=$site_file" "$config_file"
