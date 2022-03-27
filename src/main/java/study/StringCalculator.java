package study;

public class StringCalculator {
    int arithmeticOperation(String[] values) {
        int sum = Integer.parseInt(values[0]);
        for (int i = 1; i < values.length; i += 2) {
            CalculatorFactory calculatorFactory = CalculatorFactory.findByOperator(Operator.valueOfOperator(values[i]));
            sum = calculatorFactory.getCalculateValue(sum, Integer.parseInt(values[i + 1]));
        }
        return sum;
    }
}
