package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sum(double first, double second) {
        return first + second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double subtraction(double first, double second) {
        return first - second;
    }

    public static double division(double first, double second) {
        if (second == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return first / second;
    }

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subtractAndDivide(double first, double second) {
        return subtraction(first, second) + division(first, second);
    }

    public static double allMathOperations(double first, double second) {
        return sumAndMultiply(first, second) + subtractAndDivide(first, second);
    }

    public static void main(String[] args) {
        double first = 30;
        double second = 15;

        System.out.println("Результат sumAndMultiply равен: " + sumAndMultiply(first, second));
        System.out.println("Результат subtractAndDivide равен: " + subtractAndDivide(first, second));
        System.out.println("Результат allMathOperations равен: " + allMathOperations(first, second));
    }
}
