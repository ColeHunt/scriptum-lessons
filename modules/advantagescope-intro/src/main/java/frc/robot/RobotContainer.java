package frc.robot;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Pose3d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import org.littletonrobotics.junction.Logger;

/**
 * The robot's behavior lives here. {@link Robot} handles the AdvantageKit logging setup and calls
 * {@link #robotPeriodic()} every loop, so you can focus on the tool, not the code.
 *
 * <p>{@link #flywheelRpm}, {@link #gamePieceLoaded}, and {@link #robotPose} already publish live
 * through AdvantageKit's {@link Logger} - once the robot is running, AdvantageScope (the "Scope"
 * tab above) connects to that live stream automatically, the same way Elastic does.
 */
public class RobotContainer {
  private final Timer timer = new Timer();

  // Oscillates between 0 and 6000 as t increases.
  public static double flywheelRpm(double t) {
    return 3000 + 3000 * Math.sin(t);
  }

  // Toggles back and forth as t increases.
  public static boolean gamePieceLoaded(double t) {
    return ((int) t) % 2 == 0;
  }

  // A figure-8 (lemniscate) path centered on the field, facing the
  // direction of travel.
  public static Pose2d robotPose(double t) {
    double x = 4.0 + 2.0 * Math.sin(t);
    double y = 4.0 + Math.sin(2 * t);
    double dx = 2.0 * Math.cos(t);
    double dy = 2.0 * Math.cos(2 * t);
    return new Pose2d(x, y, new Rotation2d(dx, dy));
  }

  public RobotContainer() {
    timer.start();
  }

  /** Called every loop while the robot is running. Add your own logic here. */
  public void robotPeriodic() {
    // Run the command scheduler so subsystems and commands you add keep working.
    CommandScheduler.getInstance().run();

    double seconds = timer.get();

    Logger.recordOutput("FlywheelRPM", flywheelRpm(seconds));
    Logger.recordOutput("GamePieceLoaded", gamePieceLoaded(seconds));

    // Published as both a 2D and a 3D pose - the 2D Field widget wants
    // Pose2d, the 3D Field widget wants Pose3d (Pose3d(Pose2d) lifts it to
    // z=0 with no roll/pitch).
    Pose2d pose = robotPose(seconds);
    Logger.recordOutput("RobotPose2d", pose);
    Logger.recordOutput("RobotPose3d", new Pose3d(pose));
  }
}
