package stream_reduce_regex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringCalculatorUTest {

    StringCalculator stringCalculator = new StringCalculator();

    @Test
    void calculate_should_sum_all_int() {
        final String input = "1,5,8,98,g,178, 154";

        int result = stringCalculator.calculate(input);

        assertThat(result).isEqualTo(444);
    }
}
