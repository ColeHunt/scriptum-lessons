public class Main {
    // TODO: declare a constant named TEAM_NAME holding the String "Team 4143".
    // Team standard: constants use the `final` keyword and SCREAMING_SNAKE_CASE.
    public static final String TEAM_NAME = "";

    // TODO: define an enum named ALLIANCE with two values: RED and BLUE.
    // Team standard: both the enum name and its values are SCREAMING_SNAKE_CASE.
    // Put it inside this class, as a nested type - not as its own top-level
    // type below the class. It's used only by Main, so it belongs in Main.

    // TODO: define an enum named MATCH_PERIOD with three values: AUTONOMOUS,
    // TELEOP, and ENDGAME. Same rules as ALLIANCE: nested inside this class,
    // SCREAMING_SNAKE_CASE name and values.

    // TODO: declare a constant named MAX_SPEED holding 5.0.
    // Team standard: constants use the `final` keyword and SCREAMING_SNAKE_CASE.
    public static final double MAX_SPEED = 0.0;

    public static void main(String[] args) {
        // TODO: declare these four local variables, then print each one on
        // its own line with System.out.println, matching these labels:
        //   int team_number = 4143;       -> "Team number: " + team_number
        //   double pi = 3.14;              -> "Pi: " + pi
        //   boolean robot_is_on = true;    -> "Robot is on: " + robot_is_on
        //   String message = "I am a string!"; -> "Message: " + message

        System.out.println("Team name: " + TEAM_NAME);
        System.out.println("Max speed: " + MAX_SPEED);
    }
}
