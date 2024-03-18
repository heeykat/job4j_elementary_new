package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To0Then2() {
        int result = Max.max(2, 0);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3Then3() {
        int result = Max.max(3, 3);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}