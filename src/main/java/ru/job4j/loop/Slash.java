package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                // Проверяем, находится ли ячейка на одной из диагоналей
                if (row == cell || (row + cell) == (size - 1)) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Тестирование с различными размерами
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
        System.out.println("Draw by 1");
        draw(1);
        System.out.println("Draw by 4");
        draw(4);
        System.out.println("Draw by 6");
        draw(6);
    }
}
