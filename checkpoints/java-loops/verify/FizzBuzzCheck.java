import java.util.Arrays;

public class FizzBuzzCheck {
    public static void main(String[] args) {
        check(1, new String[] {"1"});
        check(3, new String[] {"1", "2", "Fizz"});
        check(15, new String[] {
            "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
            "11", "Fizz", "13", "14", "FizzBuzz"
        });
        System.out.println("fizzBuzz looks good.");
    }

    static void check(int n, String[] expected) {
        String[] actual = Main.fizzBuzz(n);
        if (actual == null || !Arrays.equals(actual, expected)) {
            System.out.println(
                "fizzBuzz(" + n + ") returned "
                    + (actual == null ? "null" : Arrays.toString(actual))
                    + ", expected " + Arrays.toString(expected) + "."
            );
            System.exit(1);
        }
    }
}
