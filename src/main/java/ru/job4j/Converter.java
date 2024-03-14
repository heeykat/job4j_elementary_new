package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 100;
    }

    public static float rubleToDollar(float value) {
        return value / 92;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(200);
        System.out.println("200 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(276);
        System.out.println("276 rubles are " + dollar + " dollar.");

        float input = 200;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("200 rubles are 2 euros. Test result : " + passed);
        input = 276;
        expected = 3;
        output = Converter.rubleToDollar(input);
        passed = expected == output;
        System.out.println("276 rubles are 3 dollars. Test result : " + passed);
    }
}
