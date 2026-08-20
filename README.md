# 🎓 Student Result Management System

A simple **Java OOP-based project** that calculates and displays a student's total marks, percentage, and result status based on marks obtained in **Physics, Mathematics, and Chemistry**.

## 🚀 Features

* Store student details:

  * Roll Number
  * Name
  * Physics Marks
  * Mathematics Marks
  * Chemistry Marks
* Calculate total marks.
* Calculate percentage.
* Determine whether the student has **Passed or Failed**.
* Display the complete student result.

## 🛠️ Concepts Used

This project demonstrates the following Java concepts:

* Classes and Objects
* Constructors
* Encapsulation
* Private Instance Variables
* Methods
* Conditional (Ternary) Operator
* Method Calling

## 📂 Project Structure

```text
Student-Result-Management-System/
│
├── Student.java
└── README.md
```

## 💻 Code Functionality

### Student Class

The `Student` class stores the student's personal and academic information.

### `calculateTotalMarks()`

Calculates the total marks obtained in all three subjects.

```text
Total Marks = Physics + Mathematics + Chemistry
```

### `calculatePercentage()`

Calculates the average percentage of the student.

```text
Percentage = Total Marks / 3
```

### `displayResult()`

Displays:

* Student Name
* Roll Number
* Total Marks
* Percentage
* Result Status

A student is considered **Pass** if the percentage is **33 or above**; otherwise, the result is **Fail**.

## 🖥️ Sample Output

```text
Name: Ayush
Roll number: 49
Total marks of Ayush is: 208.0
Percentage of Ayush is: 69.33333333333333
Result status: Pass
```

## ▶️ How to Run

1. Clone or download this repository.
2. Open the project in any Java IDE such as IntelliJ IDEA, Eclipse, or VS Code.
3. Compile the Java file:

```bash
javac Student.java
```

4. Run the program:

```bash
java StudentMain
```

## 🎯 Objective

The objective of this project is to practice fundamental **Object-Oriented Programming (OOP) concepts in Java** by creating a simple student result management system that stores student information, performs calculations, and displays the final result.

## 👨‍💻 Author

**Ayush Jha**

Aspiring Software Developer | Computer Science Student

⭐ If you found this project helpful, consider giving the repository a star!
