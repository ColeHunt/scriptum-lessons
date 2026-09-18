#!/usr/bin/env bash
set -euo pipefail
LAYOUT="$1/src/main/deploy/elastic-layout.json"

if [[ ! -s "$LAYOUT" ]]; then
	echo "Save your Elastic layout (it saves automatically), then click Verify again."
	exit 1
fi

if jq -e '
	any(.tabs[]?.grid_layout.containers[]?;
		.type == "Graph" and
		((.properties.topic // "") | endswith("IntakeCurrentAmps"))
	)
' "$LAYOUT" >/dev/null 2>&1; then
	echo "Graph bound to IntakeCurrentAmps looks good."
	exit 0
fi

echo "Add a Graph widget and bind it to IntakeCurrentAmps."
exit 1
