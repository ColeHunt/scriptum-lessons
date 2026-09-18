#!/usr/bin/env bash
set -euo pipefail
LAYOUT="${2:-}"

if [[ -z "$LAYOUT" || ! -s "$LAYOUT" ]]; then
	echo "Open AdvantageScope and add a 2D Field tab, then click Verify again."
	exit 1
fi

# TabType.Field2d = 2 (vendor/AdvantageScope/src/shared/TabType.ts).
# Field2dController.saveState() returns { sources: SourceListState, ... }
# (vendor/AdvantageScope/src/hub/controllers/Field2dController.ts).
if jq -e '
	any(.tabs.tabs[]?;
		.type == 2 and
		((.controller.sources // []) | any(.logKey | endswith("RobotPose2d")))
	)
' "$LAYOUT" >/dev/null 2>&1; then
	echo "2D Field plotting RobotPose2d looks good."
	exit 0
fi

echo "Add a 2D Field tab and drag RobotPose2d onto it."
exit 1
