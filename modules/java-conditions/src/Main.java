public class Main {
    // TODO: return "EMPTY", "LOW", "MEDIUM", or "FULL" based on percent:
    //   percent == 0        -> "EMPTY"
    //   0 < percent < 50    -> "LOW"
    //   50 <= percent < 90  -> "MEDIUM"
    //   percent >= 90       -> "FULL"
    public static String batteryStatus(double percent) {
        return null;
    }

    // TODO: use a switch statement on day (1-7) to return the day's name,
    // "Monday" through "Sunday". Return "Invalid day" for anything else
    // (the switch's default case).
    public static String dayName(int day) {
        return null;
    }

    // TODO: return whether the robot can enable - true only when there's
    // comms AND the robot is not e-stopped. Use && and !.
    public static boolean canEnable(boolean hasComms, boolean eStopped) {
        return false;
    }

    // TODO: return whether day is "Saturday" OR "Sunday". Use ||.
    public static boolean isWeekend(String day) {
        return false;
    }

    // TODO: return "REVERSED" if isReversed is true, "FORWARD" otherwise.
    // Use the ternary operator (condition ? ifTrue : ifFalse) instead of an
    // if/else - one line, no braces.
    public static String motorDirection(boolean isReversed) {
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Battery at 75%: " + batteryStatus(75));
        System.out.println("Day 4: " + dayName(4));
        System.out.println("Can enable (comms, not e-stopped)? " + canEnable(true, false));
        System.out.println("Is Saturday a weekend? " + isWeekend("Saturday"));
        System.out.println("Motor direction (reversed): " + motorDirection(true));
    }
}
