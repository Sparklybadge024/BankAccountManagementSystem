# Bank Account Management System  

A progressive, Java project that simulates essential banking operations.
Built as a chapter project to practice Java basics (variables, references, methods, constructors) while adding real-world features step-by-step.

---

## 🚀 Current Features (as of now)

1. Account creation

- Account holder name

- Unique account number

- Initial balance

- Secure PIN (stored privately in class)

- Account type (Saving Account / Current Account)

2. Deposits

- Account number & name verification

- Positive amount validation

- Confirmation output (transaction log line printed)

3. Withdrawals

- PIN verification required

- Active/inactive and balance checks

- Confirmation or failure message printed

4. Account status management

- isActive updates automatically based on balance (accounts with balance ≤ 1000 are considered inactive)

5. Balance check

- Secure check requiring correct PIN

6. Interest calculator

- calculateInterest(rate, years) — prints simple interest when the account is a Saving Account (does not modify the balance)

7. PIN management

- changePin(oldPin, newPin) with verification and feedback

8. Transaction-style output

- Deposit and withdrawal methods print readable transaction lines to act as a lightweight activity log

9. Multiple accounts supported

- You can instantiate multiple BankAccount objects and operate independently on each
---

## 📌 Next Planned Steps
This project is being developed **incrementally** with each learning milestone. Upcoming features include:
- Close/deactivate an account manually

- Track number of transactions per account

- Add user input (Scanner) for interactive banking

- Handle invalid inputs gracefully (e.g., wrong data types)

- Improved structure with separate files for different classes

- Possibly introduce interest calculation for savings accounts

- Manual account close / deactivate feature

- Transaction counters (number of deposits/withdrawals) per account

- Interactive CLI (Scanner) for user input and multiple operations in one session

- Input validation and graceful error handling for wrong data types

- Break project into multiple source files (one class per file)

- Add a lightweight persistence (file-based) to save accounts between runs (beginner level)

---

## 🛠️ Tech Used
- Language: **Java (JDK 17 or above recommended)**  
- IDE: Any (IntelliJ IDEA, Eclipse, or VS Code)  
- Version Control: **Git + GitHub**  

---

## 🎯 Purpose
This project is part of my **Java learning journey**.  
Every chapter will have its own **major project** to reinforce concepts. This one is the **Chapter 3 project** on variables, primitives, references, and class basics.  

---

📁 Project structure (single-file layout for learning)
/BankAccountManagementSystem
  ├─ BankAccountManagementSystem.java   # main & demo usage
  ├─ README.md


In the future we’ll split classes into separate files (e.g., BankAccount.java) for better structure.

## 📂 How to Run
1. Clone the repository  
   ```bash
   git clone https://github.com/YourUsername/BankAccountManagementSystem.git

2. Compile the program

javac BankAccountManagementSystem.java


3. Run the program

java BankAccountManagementSystem

# 🧾 Sample console output (example):-
Account Holder Name: Steve Rogers
Account Number: 327648730
Balance: 1000000.5666
Account Active: true

Account holder Name: Steve Rogers ,Deposited: 1000.0 ,New Balance: 1001000.5666 ,Active: true
Deposit failed: Account details are not accurate.
Withdrawal failed: Account inactive or insufficient funds.
...
Available balance: 2001000.5666
Saving account interest (6% for 2 years): 240120.0
PIN has been changed.
Transaction Failed: Incorrect PIN Entered.
Withdraw: 100 ,New Balance: 999900.5666 ,Active: true

# 🧠 What I learned building this

- Class and object basics in Java (constructors, fields, methods)

- Distinction between primitive types and object references

- Method design for validation and state updates (deposit/withdraw/checkBalance)

- Simple encapsulation: keeping pin private and providing controlled methods to use it

- How to incrementally build a project and test behavior as features are added

📖 Learning Progress:-
✅ Project initialized and basic account operations implemented
✅ Added account number & PIN verification
✅ Improved deposit/withdraw logic with validation
✅ Multiple accounts supported
🔄 Ongoing — More features to be added with each milestone

✨ This is an educational project. Follow along as I build it step by step while learning Java!

## Author

Rishabh Sundli — learning Java through hands-on projects.
Connect on LinkedIn: https://www.linkedin.com/in/rishabh-sundli-2b6172211/
