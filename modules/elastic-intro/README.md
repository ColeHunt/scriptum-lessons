# Elastic: Configuring a Competition Dashboard

Background: [Elastic](https://frc-elastic.gitbook.io/docs) is the dashboard
teams run on the driver station laptop during a match - number displays,
boolean indicators, a field view, and more, all bound to live NetworkTables
data.

Unlike AdvantageScope, Elastic only shows *live* data - there's no log file
to open. Click **Run** to start the robot in simulation, then open the
**Elastic** pane on the right. It connects automatically.

## Contract

Fill in the two methods in `src/main/java/frc/robot/RobotContainer.java`:

- `double climberSpeed(double t)` - between 0.0 and 1.0, changing over time
  (a sine wave works well).
- `boolean gamePieceLoaded(double t)` - toggles back and forth as `t`
  increases.

Once you click Run, these publish live to `ClimberSpeed` and
`GamePieceLoaded`. A robot pose driving in a circle is already provided at
`Field2d/Robot`, so you don't need to write any pose math.

## Using Elastic

With the robot running:

1. Drag a **Number Bar** widget onto the grid and bind it to `ClimberSpeed`.
   Set its range to roughly 0-1.
2. Drag a **Boolean Box** widget and bind it to `GamePieceLoaded`.
3. (Optional) Drag a **Field** widget and point its topic at `Field2d` - it
   automatically looks for the robot's pose at `Field2d/Robot`.

Elastic saves your layout automatically as you go.

## Checking your work

Click **Checkpoints** in the top bar and run **Verify** whenever you want -
the robot needs to be running for the live-data checkpoints to see anything.
The layout checkpoints look at whatever you've saved in Elastic, any time.
