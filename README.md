# RPN-Calculator-
Post-Fix Reverse Polish Notation Calculator

RPN Calculator
This is a simple Reverse Polish Notation (RPN) calculator implemented in Java. RPN is a mathematical notation in which every operator follows all of its operands. This calculator supports basic arithmetic operations: addition (+), subtraction (-), and multiplication (*).

Features
Tokenization: The input string is tokenized into individual elements (numbers and operators).
Stack-based Calculation: The calculator uses a stack to evaluate the RPN expression.
Error Handling: The calculator handles errors such as invalid expressions, insufficient operands, and too many operands.

How to Use
Input Format: Provide a string of space-separated numbers and operators in RPN format.
Example: 3 4 + 5 * evaluates to (3 + 4) * 5 = 35.

Supported Operators:

+ : Addition
- : Subtraction
* : Multiplication

Error Messages:
Error: invalid expression: The input string is not a valid RPN expression.
Error: insufficient operands: There are not enough operands for the operation.
Error: too many operands: There are too many operands left after evaluation.
