# Conditions

Background: [Conditions](https://frc-team-4143.github.io/docs/software/java/conditions).

All the code lives in `src/Main.java`. Click **Run** any time to see your
methods' output printed to the terminal.

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

- `String batteryStatus(double percent)` — `"EMPTY"` at exactly 0,
  `"LOW"` below 50, `"MEDIUM"` below 90, `"FULL"` at 90 and above. Use an
  `if` / `else if` / `else` chain.
- `String dayName(int day)` — `"Monday"` through `"Sunday"` for `day` 1–7,
  using a `switch` statement. Return `"Invalid day"` for anything else (the
  switch's `default` case).

## Checking your work

Click **Checkpoints** in the top bar and run **Verify** whenever you want.
