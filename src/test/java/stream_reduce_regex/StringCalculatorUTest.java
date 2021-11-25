package stream_reduce_regex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringCalculatorUTest {
    @Test
    void calculate_should_sum_all_int() {
        final String input = "1,5,8,98,178, 154";

        int result = new StringCalculator().calculate(input);

        assertThat(result).isEqualTo(444);
    }
}