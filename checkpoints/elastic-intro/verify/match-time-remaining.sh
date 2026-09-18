#!/usr/bin/env bash
set -euo pipefail
LAYOUT="$1/src/main/deploy/elastic-layout.json"

if [[ ! -s "$LAYOUT" ]]; then
	echo "Save your Elastic layout (it saves automatically), then click Verify again."
	exit 1
fi

if jq -e '
	any(.tabs[]?.grid_layout.containers[]?;
		.type == "Match Time" and
		((.properties.topic // "") | endswith("MatchTimeRemaining"))
	)
' "$LAYOUT" >/dev/null 2>&1; then
	echo "Match Time bound to MatchTimeRemaining looks good."
	exit 0
fi

echo "Add a Match Time widget and bind it to MatchTimeRemaining."
exit 1
