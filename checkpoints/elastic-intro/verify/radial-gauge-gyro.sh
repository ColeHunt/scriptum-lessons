#!/usr/bin/env bash
set -euo pipefail
LAYOUT="$1/src/main/deploy/elastic-layout.json"

if [[ ! -s "$LAYOUT" ]]; then
	echo "Save your Elastic layout (it saves automatically), then click Verify again."
	exit 1
fi

if jq -e '
	any(.tabs[]?.grid_layout.containers[]?;
		.type == "Radial Gauge" and
		((.properties.topic // "") | endswith("GyroHeadingDegrees"))
	)
' "$LAYOUT" >/dev/null 2>&1; then
	echo "Radial Gauge bound to GyroHeadingDegrees looks good."
	exit 0
fi

echo "Add a Radial Gauge widget and bind it to GyroHeadingDegrees."
exit 1
