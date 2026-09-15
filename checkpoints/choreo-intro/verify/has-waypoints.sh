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
	if jq -e '(.snapshot.waypoints | length) >= 2' "$traj" >/dev/null 2>&1; then
		echo "Path has at least two waypoints."
		exit 0
	fi
done

echo "Add at least two waypoints to your path (a start and an end)."
exit 1
