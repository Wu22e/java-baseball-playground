package study;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public enum Operator {
    PLUS("+"), MINUS("-"), MULTIPLY("*"), DIVIDE("/");

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
}
