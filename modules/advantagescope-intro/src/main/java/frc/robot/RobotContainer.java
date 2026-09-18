package frc.robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import org.littletonrobotics.junction.Logger;

/**
 * The robot's behavior lives here. {@link Robot} handles the AdvantageKit logging setup and calls
 * {@link #robotPeriodic()} every loop, so you can focus on the tool, not the code.
 *
 * <p>{@link #flywheelRpm} and {@link #gamePieceLoaded} already publish live through
 * AdvantageKit's {@link Logger} - once the robot is running, AdvantageScope (the "Scope" tab
 * above) connects to that live stream automatically, the same way Elastic does.
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
  }
}
