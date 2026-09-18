#!/usr/bin/env bash
set -euo pipefail
LAYOUT="$1/src/main/deploy/elastic-layout.json"

if [[ ! -s "$LAYOUT" ]]; then
	echo "Save your Elastic layout (it saves automatically), then click Verify again."
	exit 1
fi

if jq -e '
	any(.tabs[]?.grid_layout.containers[]?;
		.type == "Number Slider" and
		((.properties.topic // "") | endswith("ShooterAngleDegrees"))
	)
' "$LAYOUT" >/dev/null 2>&1; then
	echo "Number Slider bound to ShooterAngleDegrees looks good."
	exit 0
fi

echo "Add a Number Slider widget and bind it to ShooterAngleDegrees."
exit 1
