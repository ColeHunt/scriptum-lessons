#!/usr/bin/env bash
set -euo pipefail
LAYOUT="$1/src/main/deploy/elastic-layout.json"

if [[ ! -s "$LAYOUT" ]]; then
	echo "Save your Elastic layout (it saves automatically), then click Verify again."
	exit 1
fi

if jq -e '
	any(.tabs[]?.grid_layout.containers[]?;
		.type == "Toggle Switch" and
		((.properties.topic // "") | endswith("BrakeModeEnabled"))
	)
' "$LAYOUT" >/dev/null 2>&1; then
	echo "Toggle Switch bound to BrakeModeEnabled looks good."
	exit 0
fi

echo "Add a Toggle Switch widget and bind it to BrakeModeEnabled."
exit 1
