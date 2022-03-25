package study;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    void arithmeticOperationTest() {
        String value = "2 + 3 * 4 / 2";
        String[] values = value.split(" ");
        System.out.println(stringCalculator.arithmeticOperation(values));
    }
}