package study;

public class StringCalculator {
    int arithmeticOperation(String[] values) {
        int sum = Integer.parseInt(values[0]);
        for (int i = 1; i < values.length; i += 2) {
            if (values[i].equals("+")) {
                sum += Integer.parseInt(values[i + 1]);
                continue;
            }
            if (values[i].equals("-")) {
                sum -= Integer.parseInt(values[i + 1]);
                continue;
            }
            if (values[i].equals("*")) {
                sum *= Integer.parseInt(values[i + 1]);
                continue;
            }
            if (values[i].equals("/")) {
                sum /= Integer.parseInt(values[i + 1]);
                continue;
            }
        }
        return sum;
    }
}
