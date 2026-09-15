#!/usr/bin/env bash
set -euo pipefail
PROJECT="$1"
DEPLOY="$PROJECT/src/main/deploy/choreo"

shopt -s nullglob
trajs=("$DEPLOY"/*.traj)

if [ ${#trajs[@]} -eq 0 ]; then
	echo "No path found yet. Create a path in the Choreo pane and generate it."
	exit 1
fi

for traj in "${trajs[@]}"; do
	if jq -e '(.trajectory.samples | length) > 0' "$traj" >/dev/null 2>&1; then
		echo "Path generated successfully."
		exit 0
	fi
done

echo "Your path hasn't generated yet - Choreo couldn't solve it. Check that your constraints aren't impossible to satisfy (e.g. a velocity limit the robot can't hit)."
exit 1
