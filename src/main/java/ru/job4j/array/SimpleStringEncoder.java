package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = '\u0000';
        int counter = 1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                if (counter == 1) {
                    symbol = input.charAt(i);
                    result += symbol;
                } else {
                    result += "" + counter;
                    symbol = input.charAt(i);
                    result += symbol;
                    counter = 1;
                }
            }
        }
        if (counter != 1) {
            result += "" + counter;
        }
        return result;
    }
}
