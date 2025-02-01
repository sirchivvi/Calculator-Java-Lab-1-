Calculator Program
A Java-based calculator with arithmetic operations, Fibonacci sequence, and statistical calculations.

This program is a simple command-line calculator implemented in Java. It allows users to perform basic arithmetic operations, compute Fibonacci sequences, and analyze statistical properties of an array (mean, variance, and standard deviation).


The project contains three Java files, each serving a distinct purpose:

1) Main.java - The main driver program, which provides a menu-based selection system.
2) UserInput.java - Handles user input for numbers and arrays.
3) Calculator.java - Contains all mathematical operations and calculations.


Arithmetic Operations

    Addition (addition()) → Returns the sum of two numbers.
    Subtraction (subtraction()) → Returns the difference between two numbers.
    Multiplication (multiplication()) → Returns the product of two numbers.
    Division (division()) → Returns the quotient after dividing two numbers (handles division by zero).


    Fibonacci Sequence

    fibonacci(int n) → Prints the first n terms of the Fibonacci sequence.


    Statistical Operations

    Mean (mean(int[] array)) → Computes the average value of an array.
    Variance (variance(int[] array)) → Measures the spread of data points in an array.
    Standard Deviation (standardDeviation(int[] array)) → Computes the square root of variance, indicating data dispersion.



1)Compile the Java files
  javac Main.java UserInput.java Calculator.java

2)Run the program
  java Main
