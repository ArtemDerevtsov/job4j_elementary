package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void thenStart0Finish10thenSum55() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int sum = Counter.sum(start, finish);
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void thenStart3Finish8thenSum33() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        int sum = Counter.sum(start, finish);
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void thenStart1Finish1thenSum1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        int sum = Counter.sum(start, finish);
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void thenStart15Finish8thenSum0() {
        int start = 15;
        int finish = 8;
        int expected = 0;
        int sum = Counter.sum(start, finish);
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void thenStartMinus1Finish5thenSum14() {
        int start = -1;
        int finish = 5;
        int expected = 14;
        int sum = Counter.sum(start, finish);
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void thenStartMinus8FinishMinus1thenSumMinus36() {
        int start = -8;
        int finish = -1;
        int expected = -36;
        int sum = Counter.sum(start, finish);
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void thenStart0Finish0thenSum0() {
        int start = 0;
        int finish = 0;
        int expected = 0;
        int sum = Counter.sum(start, finish);
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom0To10Then30() {
        int start = 0;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom3To8Then18() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom1To1Then0() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom15To8Then0() {
        int start = 15;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus1To5Then6() {
        int start = -1;
        int finish = 5;
        int result = Counter.sumByEven(start, finish);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus8ToMinus1ThenMinus20() {
        int start = -8;
        int finish = -1;
        int result = Counter.sumByEven(start, finish);
        int expected = -20;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom0To0Then0() {
        int start = 0;
        int finish = 0;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}