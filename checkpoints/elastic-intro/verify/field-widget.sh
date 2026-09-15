#!/usr/bin/env bash
set -euo pipefail
LAYOUT="$1/src/main/deploy/elastic-layout.json"

if [[ ! -s "$LAYOUT" ]]; then
	echo "Save your Elastic layout (it saves automatically), then click Verify again."
	exit 1
fi

# The Field widget's topic is a root prefix (it subscribes to <topic>/Robot),
# not the full path to the pose itself - so it should end in "Field2d", not
# "Field2d/Robot".
if jq -e '
	any(.tabs[]?.grid_layout.containers[]?;
		.type == "Field" and
		((.properties.topic // "") | endswith("Field2d"))
	)
' "$LAYOUT" >/dev/null 2>&1; then
	echo "Field widget bound to Field2d looks good."
	exit 0
fi

echo "Add a Field widget and set its topic to Field2d."
exit 1
