# Loops

Background: [Loops](https://docs.marswars.org/docs/software/java/loops).

All the code lives in `src/Main.java`. Click **Run** any time to see your
methods' output printed to the terminal.

Team standard: avoid `while` loops (they're dangerous in robot code — one
missed exit condition and the robot stops responding). Use `for` loops
instead, which force you to think about the exit condition up front.

:::note[Just enough about methods for now]

You haven't learned methods yet - that's its own lesson later. For now, all
you need is this: a method is a small box with a name. The words in its
parentheses are **parameters** - values handed to you, which you can use
like any other variable. `return` is how the method sends its answer back
out. For example:

```java
public static int square(int n) {
    return n * n;
}
```

Calling `square(5)` runs that code with `n` set to `5`, and hands back
`25`. That's it - fill in the methods below the same way. You'll get the
full picture in the **Methods** lesson later.

:::

## Contract

- `int sumTo(int n)` — the sum of every integer from 1 to `n` (inclusive),
  computed with a `for` loop (not the shortcut formula).
- `int countDivisibleByThree(int n)` — how many integers from 1 to `n`
  (inclusive) are evenly divisible by 3.
- `String[] fizzBuzz(int n)` — the classic FizzBuzz exercise: for each number
  1 to `n`, `"FizzBuzz"` if divisible by 3 and 5, `"Fizz"` if just by 3,
  `"Buzz"` if just by 5, otherwise the number itself as a string.

## Checking your work

Click **Checkpoints** in the top bar and run **Verify** whenever you want.
