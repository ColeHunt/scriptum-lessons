# Arrays

Background: [Arrays and ArrayLists](https://frc-team-4143.github.io/docs/software/java/arrays).

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

- `int max(int[] values)` — the largest value in the array.
- `double average(int[] values)` — the average of every value, as a `double`.
- `int[] doubleAll(int[] values)` — a **new** array with every value doubled.
  Don't modify the array you were given.
- `boolean contains(int[] values, int target)` — whether `target` appears
  anywhere in `values`.

## Checking your work

Click **Checkpoints** in the top bar and run **Verify** whenever you want.
