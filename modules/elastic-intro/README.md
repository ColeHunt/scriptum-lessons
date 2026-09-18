# Elastic: Configuring a Competition Dashboard

Background: [Elastic](https://frc-elastic.gitbook.io/docs) is the dashboard
teams run on the driver station laptop during a match - number displays,
boolean indicators, a field view, and more, all bound to live NetworkTables
data.

The robot code is already written and already publishing one value for every
single-topic widget type Elastic has, plus a robot pose driving in a circle
at `Field2d/Robot` - this lesson is about the tool, not the code. Click
**Start** in the Driver Station, choose a mode, and click **Enable**. Then
open the **Elastic** pane on the right. Unlike AdvantageScope, Elastic only
shows *live* data - there's no log file to open, and it connects
automatically.

## Using Elastic

With the robot running, drag each of these onto the grid and bind it to the
listed topic (type the topic into the widget's properties, or drag the topic
from the tree on the left):

| Widget | Bind to | Suggested settings |
| --- | --- | --- |
| Text Display | `Counter` | - |
| Large Text Display | `StatusMessage` | - |
| Number Slider | `ShooterAngleDegrees` | Range 0-45 |
| Number Bar | `ClimberSpeed` | Range 0-1 |
| Voltage View | `BatteryVoltage` | Default range (4-13) is fine |
| Radial Gauge | `GyroHeadingDegrees` | Range 0-360, turn on **Wrap Value** |
| Graph | `IntakeCurrentAmps` | - |
| Match Time | `MatchTimeRemaining` | - |
| Boolean Box | `GamePieceLoaded` | - |
| Toggle Button | `BrakeModeEnabled` | - |
| Toggle Switch | `BrakeModeEnabled` | Same topic as Toggle Button - one setting, two widgets |
| Single Color View | `StatusColorHex` | - |
| Multi Color View | `LedStripColorsHex` | - |

(Optional) Drag a **Field** widget and point its topic at `Field2d` - it
automatically looks for the robot's pose at `Field2d/Robot`.

Elastic saves your layout automatically as you go.

## Checking your work

Click **Checkpoints** in the top bar and run **Verify** whenever you want -
every checkpoint here looks at whatever you've saved in your Elastic layout,
so they work any time, robot running or not.
