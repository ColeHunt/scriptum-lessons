# Inheritance

This lesson extends the `BankAccount` class you built in Classes & Objects
- it's given to you complete in `src/BankAccount.java` this time, because
this lesson is about building *on top of* a class, not rewriting it.

## What inheritance is

`class SavingsAccount extends BankAccount` means every `SavingsAccount`
*is a* `BankAccount` - it automatically has `owner_`, `balance_`,
`deposit`, `withdraw`, `getBalance`, and `transfer`, without you retyping
any of it. A subclass can do two things with what it inherits:

- **Add** something new (a field, a method) that the parent didn't have -
  `SavingsAccount.applyInterest()` below.
- **Override** a method the parent already has, replacing its behavior for
  this subclass specifically - `CheckingAccount.withdraw()` below.

A subclass's constructor has to call the parent's constructor first (with
`super(...)`) to set up the fields it inherited, before touching anything
of its own.

## Contract

- `SavingsAccount extends BankAccount`
  - `SavingsAccount(String owner, double initial_balance, double interest_rate)`
  - `applyInterest()` — deposits `getBalance() * interest_rate_` into the
    account.
- `CheckingAccount extends BankAccount`
  - `CheckingAccount(String owner, double initial_balance, double overdraft_limit)`
  - `withdraw(double amount)` — **overrides** `BankAccount`'s version:
    allowed even if it takes the balance negative, as long as it doesn't
    go below `-overdraft_limit_`.

## Checking your work

Click **Checkpoints** in the top bar and run **Verify** whenever you want.
