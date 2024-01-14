package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3numbers() {
        int[] data = new int[] {5, 9, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 5, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5numbers() {
        int[] data = new int[] {8, 6, 10, 9, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {6, 7, 8, 9, 10};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort10numbers() {
        int[] data = new int[] {4, 7, 1, 9, 3, 10, 2, 5, 8, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(result).containsExactly(expected);
    }
}