# AdvantageScope: Reading Robot Telemetry

Background: [AdvantageScope](https://docs.advantagescope.org/) is the tool
teams use to visualize robot telemetry - line graphs, 3D/2D fields, tables,
and more.

AdvantageScope reads *live* data here, the same way Elastic does - there's no
log file to open. Click **Run** to start the robot in simulation, then open
the **Scope** pane on the right. It connects automatically.

## Contract

Fill in the two methods in `src/main/java/frc/robot/RobotContainer.java`:

- `double flywheelRpm(double t)` - oscillates between 0 and 6000 as `t`
  increases (a sine wave works well).
- `boolean gamePieceLoaded(double t)` - toggles back and forth as `t`
  increases.

Once you click Run, these publish live to `FlywheelRPM` and
`GamePieceLoaded`.

## Using AdvantageScope

With the robot running:

1. Drag **FlywheelRPM** onto a new **Line Graph** tab.
2. Right-click the graph's Y axis and lock its range to roughly 0-6000.
3. (Optional) Drag **GamePieceLoaded** onto a new **Table** tab.

## Checking your work

Click **Checkpoints** in the top bar and run **Verify** whenever you want -
the robot needs to be running for the live-data checkpoints to see anything.
The layout checkpoints look at whatever you've configured in AdvantageScope,
any time.
