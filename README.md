# Simple Calculator (Java Console Application)

##  Overview
A sleek, console-based Java calculator supporting basic arithmetic (addition, subtraction, multiplication, division, modulus), now refactored using **SOLID principles** and the **Factory Design Pattern** for improved maintainability and extensibility.

---

##  Key Features

- **Core Operations**: Addition (`+`), subtraction (`-`), multiplication (`*`), division (`/`), modulus (`%`)
- **Flexible Exit**: Users can exit at any prompt by typing `x` or `X`
- **Robust Input Validation**: Handles invalid numbers and operators gracefully
- **Division Safety**: Prevents division by zero errors
- **Extensible Design**:
  - Follows **SOLID** architectural guidelines (Open–Closed, Single Responsibility, etc.)
  - Implements **Factory Pattern** to easily add new operations without modifying existing code

---

##  Design & Architecture

Calculator.java
└── CalculatorFactory (Factory Pattern)
└── Operator interface + ConcreteOperation classes

- **Interface**: `Operation` defines a single `execute(double a, double b)` method.
- **Factory**: `CalculatorFactory` returns appropriate `Operation` objects based on user-provided operator.
- **Open–Closed Principle**: To add a new operation (like power or square root), simply:
  1. Implement a new `Operation` subclass.
  2. Update `CalculatorFactory` to handle the new operator key.
  No existing logic needs to be changed — you’re open for extension, closed for modification.

---

##  Technologies Used

- Java (Core Java, OOP, interfaces)
- Console I/O with `Scanner`

---

##  Project Structure

SimpleCalculator/
├── src/
│ ├── Calculator.java
│ ├── Operation.java
│ ├── AddOperation.java
│ ├── SubtractOperation.java
│ ├── MultiplyOperation.java
│ ├── DivideOperation.java
│ ├── ModulusOperation.java
│ └── CalculatorFactory.java
└── README.md

---

##  How to Run

```bash
git clone https://github.com/ShreyMadaan/SimpleCalculator.git
cd SimpleCalculator/src
javac *.java
java Calculator

---

## Sample Interaction

=== Simple Calculator ===
Tip: You can exit anytime by typing 'x' or 'X'

Enter first number: 12
Enter operator (+, -, *, /, %): +
Enter second number: 8
Result: 20.0
-------------------------

Enter first number: x
Exiting Calculator. Goodbye!

---

## Future Enhancements

Add new operations (e.g. power, percentage, square root)
Implement command history or memory functions
Transition to a Maven setup for better structure as project complexity grows

## Commit Highlights

init: Initial calculator logic
feat: Live input loop with validation and exit condition
refactor: Applied SOLID + Factory design pattern for scalable architecture

---

## Why This Matters

By layering core functionality on top of solid architectural patterns, this project evolves from a simple utility into a well-designed codebase — making modifications and enhancements straightforward while retaining clarity.

---

Feel free to star, fork, or contribute!
