package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = row; index < board.length; index++) {
            for (int cell = 0; cell < board.length; cell++) {
                if (board[row][cell] != 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}