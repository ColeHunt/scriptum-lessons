public class Main {
    // TODO: return the sum of every integer from 1 to n (inclusive).
    // Use a for loop, not the shortcut formula - team standard avoids while
    // loops in robot code, so get comfortable with for loops here.
    public static int sumTo(int n) {
        return 0;
    }

    // TODO: return how many integers from 1 to n (inclusive) are divisible by 3.
    public static int countDivisibleByThree(int n) {
        return 0;
    }

    // TODO: the classic "FizzBuzz" exercise. Return an array of n strings,
    // one per number from 1 to n (inclusive):
    //   divisible by 3 AND 5 -> "FizzBuzz"
    //   divisible by 3 only  -> "Fizz"
    //   divisible by 5 only  -> "Buzz"
    //   otherwise            -> the number itself, as a string (e.g. "7")
    public static String[] fizzBuzz(int n) {
        return new String[0];
    }

    public static void main(String[] args) {
        System.out.println("Sum to 5: " + sumTo(5));
        System.out.println("Divisible by 3 up to 12: " + countDivisibleByThree(12));
        System.out.println("FizzBuzz to 15: " + java.util.Arrays.toString(fizzBuzz(15)));
    }
}
