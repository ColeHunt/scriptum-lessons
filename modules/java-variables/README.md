# Variables

Background: [Variables and Datatypes](https://frc-team-4143.github.io/docs/software/java/vars-dt).

All the code lives in `src/Main.java`. Click **Run** any time to see your
output printed to the terminal.

## Datatypes you'll use here

- `int` — a whole number, like `4143`.
- `double` — a decimal number, like `3.14`.
- `boolean` — either `true` or `false`.
- `String` — text, wrapped in double quotes, like `"I am a string!"`.
- `enum` — a type you define yourself, with a fixed set of named values,
  like `RED` and `BLUE`.

## Declaring vs. assigning

`int team_number;` *declares* a variable without giving it a value yet.
`team_number = 4143;` *assigns* it one. You can — and usually should — do
both on one line:
```java
int team_number = 4143;
```
A variable that's declared but never assigned is dangerous: nothing stops
other code from reading it before it has a real value. The team standard is
to always declare and assign together, so that never happens.

## Why constants?

A constant is a variable that's never meant to change, like a robot's max
speed or a wheel diameter. Adding `final` to the declaration locks it — the
compiler will stop you if you (or a teammate) accidentally try to reassign
it later. Constants are also named differently from regular variables, in
`SCREAMING_SNAKE_CASE`, so they're easy to spot at a glance:
```java
public static final double MAX_SPEED = 5.0;
```

## Contract

Inside `main`, declare four local variables — name them whatever you like —
and print each one with `System.out.println` so your output matches this
table exactly (the checkpoint reads what gets printed, not your variable
names):

| Datatype | Value | Printed key |
| --- | --- | --- |
| `int` | `4143` | `Team number` |
| `double` | `3.14` | `Pi` |
| `boolean` | `true` | `Robot is on` |
| `String` | `"I am a string!"` | `Message` |

For example, the `int` row means: declare an `int` set to `4143`, then print
`System.out.println("Team number: " + yourVariableName);`. Do the same for
the other three rows.

:::warning[Match the printed format exactly]

The checkpoint looks for the exact text `key: value` — the printed key, a
colon, one space, then the value. `Team number:4143` (missing the space) or
`team number: 4143` (wrong capitalization) won't match, even though they
print basically the same information.

:::

The constants and enums below are different — the checkpoints look these up
by name via reflection, so fill them in exactly as named:

- `String TEAM_NAME` — a `public static final` constant equal to
  `"Team 4143"`. Team standard: constants are `SCREAMING_SNAKE_CASE` and
  `final`.
- An `enum` named `ALLIANCE` with two values, `RED` and `BLUE`. Define it
  as a nested type inside the `Main` class, not as its own top-level type -
  it's only used by `Main`, so it belongs in `Main`. Team standard: enum
  names *and* their values are both `SCREAMING_SNAKE_CASE`.
- An `enum` named `MATCH_PERIOD` with three values, `AUTONOMOUS`, `TELEOP`,
  and `ENDGAME`. Same rules as `ALLIANCE`: nested inside `Main`,
  `SCREAMING_SNAKE_CASE` name and values.
- `double MAX_SPEED` — a `public static final` constant equal to `5.0`.
  Team standard: constants are `SCREAMING_SNAKE_CASE` and `final`.

## Checking your work

Click **Checkpoints** in the top bar and run **Verify** whenever you want.
