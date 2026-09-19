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

| Widget | Bind to | Settings |
| --- | --- | --- |
| Text Display | `Counter` | - |
| Large Text Display | `StatusMessage` | - |
| Number Slider | `ShooterAngleDegrees` | Min 0, Max 45 |
| Number Bar | `ClimberSpeed` | Range 0-1 |
| Voltage View | `BatteryVoltage` | Default range (4-13) is fine |
| Radial Gauge | `GyroHeadingDegrees` | Min/Max Value 0/360, Start/End Angle 0/360 |
| Graph | `IntakeCurrentAmps` | Min 0, Max 45, Graph Color pure white |
| Match Time | `MatchTimeRemaining` | Red Start Time 15, Yellow Start Time 45 |
| Boolean Box | `GamePieceLoaded` | - |
| Single Color View | `StatusColorHex` | - |
| Multi Color View | `LedStripColorsHex` | - |

(Optional) Drag a **Field** widget and point its topic at `Field2d` - it
automatically looks for the robot's pose at `Field2d/Robot`.

## Writing to the robot

Every widget above only *displays* a value the robot code already computed.
These five go the other way - you set them from Elastic, and the robot code
just reads whatever you last sent:

| Widget | Bind to | Settings |
| --- | --- | --- |
| ComboBox Chooser | `AutoRoutine` | - |
| Split Button Chooser | `AutoRoutine` | Same topic as the ComboBox Chooser - one chooser, two widgets |
| Text Display | `AutoDelaySeconds` | Turn on Show Submit Button, so it publishes once you hit Enter instead of on every keystroke |
| Toggle Button | `BrakeModeEnabled` | - |
| Toggle Switch | `BrakeModeEnabled` | Same topic as the Toggle Button - one setting, two widgets |

Try it live: pick a different option in the chooser, type a new number into
`AutoDelaySeconds` and submit it, and click the brake mode toggle - each
change reaches the robot over NetworkTables the same way a real driver
station does before a match. There's nothing to arm first, unlike
AdvantageScope's Tuning Mode: any widget bound to a plain writable topic
accepts input as soon as it's on the grid.

Elastic doesn't always autosave right away - use **File > Save** before
clicking Verify, or your latest changes won't be there yet.

Elastic also remembers whatever layout it last had open, separate from this
project's own layout file - so if this module was just reset, or you're
coming from a different lesson, you may see an old dashboard instead of a
blank one. If that happens, use **File > Open Layout** (`Ctrl+O`) and pick
`src/main/deploy/elastic-layout.json` from this project to get back to a
clean slate.

## Checking your work

Click **Checkpoints** in the top bar and run **Verify** whenever you want -
every checkpoint here looks at whatever you last saved in your Elastic
layout (see the note above), so they work any time, robot running or not.
For the Number Slider, Radial Gauge, Graph, and Match Time widgets, the
checkpoint also checks the range/threshold settings from the table above,
not just which topic the widget is bound to.
