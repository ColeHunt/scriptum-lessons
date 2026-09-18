# AdvantageScope: Reading Robot Telemetry

Background: [AdvantageScope](https://docs.advantagescope.org/) is the tool
teams use to visualize robot telemetry - line graphs, 3D/2D fields, tables,
and more.

The robot code is already written and already publishing `FlywheelRPM` (an
oscillating value), `GamePieceLoaded` (a toggling boolean), and a robot pose
driving a figure-8 around the field (`RobotPose2d`/`RobotPose3d`) - this
lesson is about the tool, not the code. Click **Start** in the Driver
Station, choose a mode, and click **Enable**. Then open the **Scope** pane
on the right - AdvantageScope reads *live* data here, the same way Elastic
does, and connects automatically. No log file to open.

## Using AdvantageScope

With the robot running:

1. Drag **FlywheelRPM** onto a new **Line Graph** tab's left axis.
2. Right-click the left axis and lock its range to roughly 0-3000.
3. Drag **FlywheelRPM** again, this time onto the graph's right axis, then
   right-click the right axis and set its **Filter** to **Differentiate**.
   The right axis's own scale is left auto - no need to lock it.
4. Drag **GamePieceLoaded** onto the graph's discrete field (below the
   left/right axes) - it renders as colored bands instead of a numeric line.
5. Add a **2D Field** tab and drag **RobotPose2d** onto it - you'll see the
   figure-8 path traced from directly above.
6. Add a **3D Field** tab and drag **RobotPose3d** onto it - the same path,
   now with a 3D robot model driving it. Field2d wants a `Pose2d` topic;
   Field3d wants a `Pose3d` one, which is why there are two separate topics
   publishing the same path.

## Checking your work

Click **Checkpoints** in the top bar and run **Verify** whenever you want -
every checkpoint here looks at whatever you've configured in AdvantageScope.
