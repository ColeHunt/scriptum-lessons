# AdvantageScope: Reading Robot Telemetry

Background: [AdvantageScope](https://docs.advantagescope.org/) is the tool
teams use to visualize robot telemetry - line graphs, 3D/2D fields, tables,
and more.

The robot code is already written and already publishing `FlywheelRPM` (an
oscillating value) and `GamePieceLoaded` (a toggling boolean) - this lesson
is about the tool, not the code. Click **Start** in the Driver Station,
choose a mode, and click **Enable**. Then open the **Scope** pane on the
right - AdvantageScope reads *live* data here, the same way Elastic does, and
connects automatically. No log file to open.

## Using AdvantageScope

With the robot running:

1. Drag **FlywheelRPM** onto a new **Line Graph** tab's left axis.
2. Right-click the left axis and lock its range to roughly 0-3000.
3. Drag **FlywheelRPM** again, this time onto the graph's right axis, then
   right-click the right axis and set its **Filter** to **Differentiate**.
   The right axis's own scale is left auto - no need to lock it.
4. Drag **GamePieceLoaded** onto the graph's discrete field (below the
   left/right axes) - it renders as colored bands instead of a numeric line.

## Checking your work

Click **Checkpoints** in the top bar and run **Verify** whenever you want -
every checkpoint here looks at whatever you've configured in AdvantageScope.
