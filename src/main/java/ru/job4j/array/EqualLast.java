package ru.job4j.array;

public class EqualLast {
    public static boolean check(int[] left, int[] right) {
        while (left[left.length - 1] == right[right.length - 1]) {
            return true;
        }
        return false;
    }
}
