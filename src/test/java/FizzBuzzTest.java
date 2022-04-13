import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FizzBuzzTest {

    public static final String FIZZ = "fizz";
    private static final String BUZZ = "buzz";
    private static final String FIZZBUZZ = "fizzbuzz";
    private static final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void should_return_fizz_when_input_equals_3() {
        String result = fizzBuzz.execute(3);

        assertThat(result).isEqualTo(FIZZ);
    }

    @Test
    void should_return_fizz_when_multiple_of_3() {
        String result = fizzBuzz.execute(9);

        assertThat(result).isEqualTo(FIZZ);
    }

    @Test
    void should_return_1_when_input_equals_1() {
        String result = fizzBuzz.execute(1);

        assertThat(result).isEqualTo("1");
    }

    @Test
    void should_return_buzz_when_input_equals_5() {
        String result = fizzBuzz.execute(5);

        assertThat(result).isEqualTo(BUZZ);
    }

    @Test
    void should_return_buzz_when_input_multiple_of_5() {
        String result = fizzBuzz.execute(10);

        assertThat(result).isEqualTo(BUZZ);
    }

    @Test
    void should_return_fizzbuzz_when_input_multiple_of_3_and_5() {
        String result = fizzBuzz.execute(15);

        assertThat(result).isEqualTo(FIZZBUZZ);
    }
}
