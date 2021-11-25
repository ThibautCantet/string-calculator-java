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

    @Test
    void add_should_sum_all_numbers_except_not_valid_number(){
        final String input = "1,5,8,,98,fg,178,154";

        int result = new StringCalculator().calculate(input);

        assertThat(result).isEqualTo(444);
    }

    @Test
    void calculate_should_sum_all_int_when_delimiter_is_defined() {
        final String input = "\\[delime]\n1delime5delime8delime98delime178delime 154";

        int result = new StringCalculator().calculate(input);

        assertThat(result).isEqualTo(444);
    }

    @Test
    void add_should_sum_all_numbers_when_delimiter_is_defined_and_is_pipe(){
        String input = "\\[|]\n1|5|8|98|178|154";

        int result = new StringCalculator().calculate(input);

        assertThat(result).isEqualTo(444);
    }
}