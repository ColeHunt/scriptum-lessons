#!/usr/bin/env bash
set -euo pipefail
LAYOUT="$1/src/main/deploy/elastic-layout.json"

if [[ ! -s "$LAYOUT" ]]; then
	echo "Save your layout in Elastic (File > Save), then click Verify again."
	exit 1
fi

if jq -e '
	any(.tabs[]?.grid_layout.containers[]?;
		.type == "Radial Gauge" and
		((.properties.topic // "") | endswith("GyroHeadingDegrees")) and
		(.properties.min_value == 0) and
		(.properties.max_value == 360)
	)
' "$LAYOUT" >/dev/null 2>&1; then
	echo "Radial Gauge bound to GyroHeadingDegrees looks good."
	exit 0
fi

echo "Add a Radial Gauge widget, bind it to GyroHeadingDegrees, and set its range to 0-360."
exit 1
