package study;

public class StringCalculator {
    int arithmeticOperation(String[] values) {
        int sum = Integer.parseInt(values[0]);
        for (int i = 1; i < values.length; i += 2) {
            Operator operator = Operator.valueOfOperator(values[i]);
            sum = operator.getCalculateValue(sum, Integer.parseInt(values[i + 1]));
        }
        return sum;
    }
}
