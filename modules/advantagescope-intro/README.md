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

1. Drag **FlywheelRPM** onto a new **Line Graph** tab.
2. Right-click the graph's Y axis and lock its range to roughly 0-6000.
3. (Optional) Drag **GamePieceLoaded** onto a new **Table** tab.

## Checking your work

Click **Checkpoints** in the top bar and run **Verify** whenever you want -
every checkpoint here looks at whatever you've configured in AdvantageScope.
