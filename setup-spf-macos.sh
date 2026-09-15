#!/bin/sh
set -eu

repo_dir=$(CDPATH= cd -- "$(dirname -- "$0")" && pwd)
tools_dir="$repo_dir/.spf-tools"
mkdir -p "$tools_dir"

case "$(uname -m)" in
  arm64) corretto_arch=aarch64; z3_name=z3-5.1.0-arm64-osx-13.3 ;;
  x86_64) corretto_arch=x64; z3_name=z3-5.1.0-x64-osx-13.3 ;;
  *) echo "Unsupported macOS architecture: $(uname -m)" >&2; exit 1 ;;
esac

if [ ! -x "$tools_dir/amazon-corretto-8.jdk/Contents/Home/bin/java" ]; then
  curl -fL --retry 3 "https://corretto.aws/downloads/latest/amazon-corretto-8-${corretto_arch}-macos-jdk.tar.gz" -o "$tools_dir/corretto8.tar.gz"
  tar -xzf "$tools_dir/corretto8.tar.gz" -C "$tools_dir"
fi

if [ ! -f "$tools_dir/$z3_name/bin/libz3java.dylib" ]; then
  curl -fL --retry 3 "https://github.com/Z3Prover/z3/releases/download/z3-5.1.0/${z3_name}.zip" -o "$tools_dir/z3.zip"
  unzip -q -o "$tools_dir/z3.zip" -d "$tools_dir"
fi

"$tools_dir/amazon-corretto-8.jdk/Contents/Home/bin/java" -version
