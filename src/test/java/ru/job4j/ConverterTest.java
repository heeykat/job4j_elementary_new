package ru.job4j;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert200RblThen2Euro() {
        float input = 200;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert276RblThen3Dollar() {
        float input = 276;
        float expected = 3;
        float output = Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert0RblThen0Eur() {
        float input = 0;
        float expected = 0;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}