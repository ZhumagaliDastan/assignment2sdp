# Calculator with Decorator Pattern

## Introduction

This Java project is a simple calculator program that allows you to perform basic arithmetic operations (addition, subtraction, multiplication, division) on numeric values. It also demonstrates the use of the Decorator design pattern to add logging functionality to the calculator operations.

## Features

- Perform basic arithmetic operations: addition, subtraction, multiplication, division.
- Input validation for numeric values.
- Logging of each operation and its result using the Decorator pattern.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your computer.

### Installation

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/yourusername/calculator-with-decorator.git

    Compile the Java files:

    bash

    javac *.java

Usage

    Run the program:

    bash

    java Main

    Follow the on-screen instructions to perform calculations. Enter 'q' to quit.

Project Structure

    Main.java: The main entry point of the program.
    Calculator.java: Defines the basic calculator functionality.
    UserInput.java: Handles user input and validation.
    InputValidator.java: Separates input validation logic.
    LoggingCalculator.java: Implements the Decorator pattern for logging.
    Output.java: Displays the calculator results.
