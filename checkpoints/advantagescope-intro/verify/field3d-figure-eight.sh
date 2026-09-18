#!/usr/bin/env bash
set -euo pipefail
LAYOUT="${2:-}"

if [[ -z "$LAYOUT" || ! -s "$LAYOUT" ]]; then
	echo "Open AdvantageScope and add a 3D Field tab, then click Verify again."
	exit 1
fi

# TabType.Field3d = 3 (vendor/AdvantageScope/src/shared/TabType.ts).
# Field3dController.saveState() returns { sources: SourceListState, ... }
# (vendor/AdvantageScope/src/hub/controllers/Field3dController.ts).
if jq -e '
	any(.tabs.tabs[]?;
		.type == 3 and
		((.controller.sources // []) | any(.logKey | endswith("RobotPose3d")))
	)
' "$LAYOUT" >/dev/null 2>&1; then
	echo "3D Field plotting RobotPose3d looks good."
	exit 0
fi

echo "Add a 3D Field tab and drag RobotPose3d onto it."
exit 1
