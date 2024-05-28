package ru.job4j.calculator;

public class Fit {
    private static final int BASE_HEIGHT_MAN = 100;
    private static final int BASE_HEIGHT_WOMAN = 110;
    private static final double WEIGHT_FACTOR = 1.15;

    // Общий метод для расчета идеального веса
    public static double calculateIdealWeight(short height, int baseHeight) {
        return (height - baseHeight) * WEIGHT_FACTOR;
    }

    public static double calculateManIdealWeight(short height) {
        return calculateIdealWeight(height, BASE_HEIGHT_MAN);
    }

    public static double calculateWomanIdealWeight(short height) {
        return calculateIdealWeight(height, BASE_HEIGHT_WOMAN);
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 170;

        double manWeight = calculateManIdealWeight(heightMan);
        double womanWeight = calculateWomanIdealWeight(heightWoman);

        System.out.printf("Ideal weight for a man with height %d is %.2f kg%n", heightMan, manWeight);
        System.out.printf("Ideal weight for a woman with height %d is %.2f kg%n", heightWoman, womanWeight);
    }
}
