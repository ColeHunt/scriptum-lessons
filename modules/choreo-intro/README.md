# Choreo: Planning Autonomous Paths

Background: [Choreo](https://choreo.autos/) is the tool teams use to plan
autonomous paths - dragging waypoints around the field, adding constraints,
and letting a trajectory generator solve a path the robot can actually
follow.

This lesson is entirely inside the **Choreo** pane on the right - there's no
Java to write. A starter project (`robot.chor`) matching a typical swerve
robot's geometry is already loaded.

## What to do

1. Create a new path (the **+** button in the path list) and drag out at
   least two waypoints on the field.
2. Add at least one constraint from the constraints panel - **Max
   Velocity**, **Max Angular Velocity**, and **Keep In Rectangle** (a field
   boundary) are all good choices for a first path.
3. Generate the path. Choreo saves your `.traj` file automatically once it
   solves.

Exact waypoint positions don't matter - any path with the shapes above will
pass. What matters is that it actually generates: a constraint that can't be
satisfied (like a velocity limit the robot can't hit) leaves the path
unsolved.

## Checking your work

Click **Checkpoints** in the top bar and run **Verify** whenever you want -
the checkpoints read whatever you've saved in Choreo, any time.
