package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        if (isValidCoordinate(x1) && isValidCoordinate(y1) && isValidCoordinate(x2) && isValidCoordinate(y2)) {
            if (isDiagonalMove(x1, y1, x2, y2)) {
                return Math.abs(x1 - x2);
            }
        }
        return 0;
    }

    private static boolean isValidCoordinate(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    private static boolean isDiagonalMove(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) == Math.abs(y1 - y2);
    }
}
