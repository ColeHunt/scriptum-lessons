# Operators

Background: [Operators](https://docs.marswars.org/docs/software/java/operators).

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

- `int addInts(int a, int b)` — return `a + b`.
- `double inchesToMeters(double inches)` — convert inches to meters
  (1 inch = 0.0254 meters).
- `boolean isEven(int value)` — return whether `value` is even. Use `%`.
- `int subtractInts(int a, int b)` — return `a - b`.
- `double metersToInches(double meters)` — convert meters to inches
  (1 inch = 0.0254 meters). The inverse of `inchesToMeters`.
- `double applyAssignments(double start)` — starting from `start`, apply each
  assignment operator in order and return the final value:
  `x = start;` → `x += 1;` → `x -= 0.14;` → `x *= 6;` → `x /= 3;`

:::note[Just enough about comparisons for now]

`isEven` needs one more thing you haven't formally learned yet: `==`
compares two values and evaluates directly to a `boolean` — `true` or
`false` — the same way `%` evaluates to a number. You don't need an `if`
statement at all:

```java
public static boolean isPositive(int n) {
    return n > 0;
}
```

`value % 2 == 0` works the same way — one full expression, not two separate
steps. Comparisons (`==`, `!=`, `<`, `>`, and friends) get their own lesson
soon, in **Conditions**.

:::

## Checking your work

Click **Checkpoints** in the top bar and run **Verify** whenever you want.
