package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when04to98then9dot84() {
        int x1 = 0;
        int y1 = 4;
        int x2 = 9;
        int y2 = 8;
        double expected = 9.84;
        double eps = 0.01;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void when10to1Minus1then1() {
        int x1 = 1;
        int y1 = 0;
        int x2 = 1;
        int y2 = -1;
        double expected = 1;
        double eps = 0.01;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void when1Minus2to0Minus1then1dot41() {
        int x1 = 1;
        int y1 = -2;
        int x2 = 0;
        int y2 = -1;
        double expected = 1.41;
        double eps = 0.01;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void when15to11then4() {
        int x1 = 1;
        int y1 = 5;
        int x2 = 1;
        int y2 = 1;
        double expected = 4;
        double eps = 0.01;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}