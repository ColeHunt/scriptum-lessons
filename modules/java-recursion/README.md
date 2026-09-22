# Recursion (Bonus)

This one's optional - it's not required to move on to the FRC Robot track.
It's here because recursion is a fundamental tool worth seeing at least
once, even though robot code rarely uses it directly.

All the code lives in `src/Main.java`. No method bodies are given - same
as the Methods lesson, you write the full declaration yourself. `main` is
empty; call your methods from there to try them out.

## What recursion is

A recursive method calls itself with a smaller version of the same
problem, until it reaches a **base case** small enough to answer without
recursing further. Every recursive method needs one, or it calls itself
forever (and crashes with a `StackOverflowError` once it runs out of
stack space). For example:

```java
public static int countDown(int n) {
    if (n <= 0) return 0;       // base case - stop recursing
    System.out.println(n);
    return countDown(n - 1);    // the recursive call
}
```

## Contract

- `int factorial(int n)` — `n!`, computed recursively.
- `int fibonacci(int n)` — the `n`th Fibonacci number (0-indexed),
  computed recursively.
- `int sumDigits(int n)` — the sum of `n`'s digits, computed recursively.
- `String reverseString(String s)` — `s` reversed, computed recursively.

## Checking your work

Click **Checkpoints** in the top bar and run **Verify** whenever you want.
