package frc.robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import org.littletonrobotics.junction.Logger;

/**
 * The robot's behavior lives here. {@link Robot} handles the AdvantageKit logging setup and calls
 * {@link #robotPeriodic()} every loop, so you can focus on your code below.
 *
 * <p>Fill in {@link #flywheelRpm} and {@link #gamePieceLoaded} below - once you click Run, they
 * publish live through AdvantageKit's {@link Logger}, and AdvantageScope (the "Scope" tab above)
 * connects to that live stream automatically, the same way Elastic does.
 */
public class RobotContainer {
  private final Timer timer = new Timer();

  // TODO: return a flywheel RPM that oscillates between 0 and 6000 as t
  // increases - a sine wave works well, e.g. 3000 + 3000 * Math.sin(t).
  public static double flywheelRpm(double t) {
    return 0.0;
  }

  // TODO: return whether a game piece is loaded at time t. It should
  // toggle back and forth as t increases, not stay fixed - e.g. based on
  // whether (int) t is even or odd.
  public static boolean gamePieceLoaded(double t) {
    return false;
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
