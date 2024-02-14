package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when04to98then9dot84() {
        Point a = new Point(0, 4);
        Point b = new Point(9, 8);
        double expected = 9.84;
        double eps = 0.01;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void when10to1Minus1then1() {
        Point a = new Point(1, 0);
        Point b = new Point(1, -1);
        double expected = 1;
        double eps = 0.01;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void when1Minus2to0Minus1then1dot41() {
        Point a = new Point(1, -2);
        Point b = new Point(0, -1);
        double expected = 1.41;
        double eps = 0.01;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void when15to11then4() {
        Point a = new Point(1, 5);
        Point b = new Point(1, 1);
        double expected = 4;
        double eps = 0.01;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void when000to021then2dot23() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 2, 1);
        double expected = 2.23;
        double eps = 0.01;
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void when0Minus12toMinus401then4dot24() {
        Point a = new Point(0, -1, 2);
        Point b = new Point(-4, 0, 1);
        double expected = 4.24;
        double eps = 0.01;
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void when123to456then5dot19() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        double expected = 5.19;
        double eps = 0.01;
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}