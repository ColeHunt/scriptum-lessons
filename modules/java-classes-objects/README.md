# Classes & Objects

Background: [Classes and Objects](https://frc-team-4143.github.io/docs/software/java/classes-objs).

This lesson builds a small `BankAccount` class instead of the docs page's
`MotorController` example - same ideas (fields, a constructor,
encapsulation), a different object. Fill in `src/BankAccount.java`;
`src/Main.java` already creates a couple of accounts and moves money
between them, so click **Run** any time to see it in action.

## Contract

Team standard: class member fields use `trailing_snake_case_`.

- Fields: `owner_` (String), `balance_` (double) — `protected`, not
  `private` (see the Bonus **Inheritance** lesson later for why).
- `BankAccount(String owner, double initial_balance)` — sets `owner_` and
  `balance_`; a negative `initial_balance` is clamped to `0.0`.
- `void deposit(double amount)` — adds `amount` to `balance_` if it's
  positive; otherwise does nothing.
- `boolean withdraw(double amount)` — if `amount` is positive and no more
  than `balance_`, subtracts it and returns `true`; otherwise leaves
  `balance_` unchanged and returns `false`.
- `double getBalance()` — returns `balance_`.
- `boolean transfer(BankAccount recipient, double amount)` — withdraws
  `amount` from this account (by calling `withdraw` above) and, if that
  succeeds, deposits it into `recipient` (by calling `recipient`'s
  `deposit`). Returns whether the transfer went through; a failed
  withdrawal leaves both accounts untouched.

## Checking your work

Click **Checkpoints** in the top bar and run **Verify** whenever you want.
