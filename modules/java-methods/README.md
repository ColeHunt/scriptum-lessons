# Methods

Background: [Methods](https://frc-team-4143.github.io/docs/software/java/methods).

All the code lives in `src/Main.java`. Unlike earlier lessons, no method
bodies are given to fill in - you write the full declaration yourself:
modifiers, return type, name, and parameter list. `main` is empty too;
call your methods from there to try them out, the same way you tested code
directly in `main` in previous lessons.

## Contract

- `double clamp(double value, double min, double max)` — squeezes `value`
  into the `[min, max]` range: `min` if it's below `min`, `max` if it's
  above `max`, `value` unchanged otherwise.
- `double scaleJoystick(double rawInput, double sensitivity)` —
  `rawInput * sensitivity`, clamped to `[-1.0, 1.0]` by calling `clamp`
  above rather than re-checking the range itself.
- `boolean isPrime(int n)` — whether `n` is prime (2 or greater, no
  divisors other than 1 and itself).
- `int factorial(int n)` — `n!` (`n * (n-1) * ... * 1`); `0!` is `1`.
- `String reverseString(String s)` — a **new** `String` with `s`'s
  characters in reverse order.
- `boolean isPalindrome(String s)` — whether `s` reads the same forwards
  and backwards, by calling `reverseString` above rather than reversing it
  again.

## Checking your work

Click **Checkpoints** in the top bar and run **Verify** whenever you want.
