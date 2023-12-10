package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1to2then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int out = Max.max(left, right);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenMax5to1then5() {
        int left = 5;
        int right = 1;
        int expected = 5;
        int out = Max.max(left, right);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenMax1to1then1() {
        int left = 1;
        int right = 1;
        int expected = 1;
        int out = Max.max(left, right);
        assertThat(out).isEqualTo(expected);
    }
}