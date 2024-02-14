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

    @Test
    void whenMax1to2to3then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int expected = 3;
        int out = Max.max(first, second, third);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenMax1to2to3to4then4() {
        int first = 1;
        int second = 2;
        int third = 3;
        int fourth = 4;
        int expected = 4;
        int out = Max.max(first, second, third, fourth);
        assertThat(out).isEqualTo(expected);
    }
}