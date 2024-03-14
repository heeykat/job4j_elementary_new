package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndDivision(double first, double second) {
        return subtraction(first, second)
                + division(first, second);
    }

    public static double allMathOperations(double first, double second) {
        return sumAndMultiply(first, second)
                + subAndDivision(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат sumAndMultiply равен: " + sumAndMultiply(30, 15));
        System.out.println("Результат subAndDivision равен: " + subAndDivision(30, 15));
        System.out.println("Результат allMathOperations равен: " + allMathOperations(30, 15));
    }

}
