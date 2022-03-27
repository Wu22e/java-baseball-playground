package study;

import java.util.HashMap;
import java.util.Map;

public enum Operator {
    PLUS("+") {
        public int getCalculateValue(int operand1, int operand2) {
            return operand1 + operand2;
        }
    }, MINUS("-") {
        public int getCalculateValue(int operand1, int operand2) {
            return operand1 - operand2;
        }
    }, MULTIPLY("*") {
        public int getCalculateValue(int operand1, int operand2) {
            return operand1 * operand2;
        }
    }, DIVIDE("/") {
        public int getCalculateValue(int operand1, int operand2) {
            return operand1 / operand2;
        }
    };

    // Enum 항목 캐싱
    private static final Map<String, Operator> BY_OPERATOR = new HashMap<>();
    static {
        for (Operator operator : values()) {
            BY_OPERATOR.put(operator.operator, operator);
        }
    }

    private String operator;

    Operator(String operator) {
        this.operator = operator;
    }

    public static Operator valueOfOperator(String operator) {
        return BY_OPERATOR.get(operator);
    }

    public abstract int getCalculateValue(int operand1, int operand2);
}
