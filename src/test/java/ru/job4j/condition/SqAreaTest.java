package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP6K2thenSquare2() {
        int p = 6;
        double k = 2;
        int expected = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP8K3thenSquare3() {
        int p = 8;
        double k = 3;
        int expected = 3;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP10K1thenSquare6dot25() {
        int p = 10;
        double k = 1;
        double expected = 6.25;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP25K1dot5thenSquare37dot5() {
        int p = 25;
        double k = 1.5;
        double expected = 37.5;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.1));
    }

    @Test
    void whenP4dot5K2thenSquare1dot125() {
        double p = 4.5;
        double k = 2;
        double expected = 1.125;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void whenP9dot6K3dot14thenSquare4dot22() {
        double p = 9.6;
        double k = 3.14;
        double expected = 4.220961982776727;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.001));
    }
}