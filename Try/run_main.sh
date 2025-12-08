# #!/usr/bin/env bash
# # Simple helper to compile all Java sources under src and run Main
# set -euo pipefail
# WORKDIR="$(cd "$(dirname "$0")" && pwd)"
# SRCDIR="$WORKDIR/src"
# OUTDIR="$WORKDIR/out"
# mkdir -p "$OUTDIR"
# # Compile (put .class files into out)
# javac -d "$OUTDIR" "$SRCDIR"/*.java
# # Run Main from the out directory
# java -cp "$OUTDIR" Main

#!/usr/bin/env bash
set -euo pipefail

WORKDIR="$(cd "$(dirname "$0")" && pwd)"
SRCDIR="$WORKDIR/src"
OUTDIR="$WORKDIR/out"

mkdir -p "$OUTDIR"

javac -d "$OUTDIR" "$SRCDIR"/*.java

java -cp "$OUTDIR" Main
