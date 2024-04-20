package ru.job4j.calculator;

public class Fit {
    private static final int BASE_HEIGHT_MAN = 100;
    private static final int BASE_HEIGHT_WOMAN = 110;
    private static final double WEIGHT_FACTOR = 1.15;

    public static double calculateManIdealWeight(short height) {
        return (height - BASE_HEIGHT_MAN) * WEIGHT_FACTOR;
    }

    public static double calculateWomanIdealWeight(short height) {
        return (height - BASE_HEIGHT_WOMAN) * WEIGHT_FACTOR;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 170;
        double manWeight = calculateManIdealWeight(heightMan);
        double womanWeight = calculateWomanIdealWeight(heightWoman);
        System.out.printf("Ideal weight for a man with height %d is %.2f%n", heightMan, manWeight);
        System.out.printf("Ideal weight for a woman with height %d is %.2f%n", heightWoman, womanWeight);
    }
}
