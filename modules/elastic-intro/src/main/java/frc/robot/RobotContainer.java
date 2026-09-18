package frc.robot;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import org.littletonrobotics.junction.Logger;

/**
 * The robot's behavior lives here. {@link Robot} handles the AdvantageKit logging setup and calls
 * {@link #robotPeriodic()} every loop, so you can focus on the tool, not the code.
 *
 * <p>This starter logs a counter, a climber speed, a game piece sensor, and a robot pose that
 * drives in a circle, all through AdvantageKit's {@link Logger} - open Elastic (the "Elastic" tab
 * above) to confirm live telemetry works end to end, then configure Elastic to display them.
 */
public class RobotContainer {
  private final Timer timer = new Timer();
  private long counter = 0;

  // Between 0.0 and 1.0, changing over time.
  public static double climberSpeed(double t) {
    return 0.5 + 0.5 * Math.sin(t);
  }

  // Toggles back and forth as t changes.
  public static boolean gamePieceLoaded(double t) {
    return ((int) t) % 2 == 0;
  }

  public RobotContainer() {
    timer.start();
  }

  /** Called every loop while the robot is running. Add your own logic here. */
  public void robotPeriodic() {
    // Run the command scheduler so subsystems and commands you add keep working.
    CommandScheduler.getInstance().run();

    double seconds = timer.get();

    // A counter that ticks up once per loop.
    counter++;
    Logger.recordOutput("Counter", counter);

    Logger.recordOutput("ClimberSpeed", climberSpeed(seconds));
    Logger.recordOutput("GamePieceLoaded", gamePieceLoaded(seconds));

    // A pose that drives in a circle around the middle of the field. Named
    // "Field2d/Robot" - Elastic's Field widget looks for the robot pose at
    // "<topic>/Robot" under whatever root you point it at.
    double radius = 2.0;
    double omega = 1.0;
    double x = 4.0 + radius * Math.cos(omega * seconds);
    double y = 4.0 + radius * Math.sin(omega * seconds);
    Rotation2d heading = new Rotation2d(omega * seconds + Math.PI / 2);
    Logger.recordOutput("Field2d/Robot", new Pose2d(x, y, heading));
  }
}
