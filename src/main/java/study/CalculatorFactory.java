package study;

import study.exception.CalculatorException;
import study.exception.Error;

import java.util.Arrays;

public enum CalculatorFactory {
    PLUS(Operator.PLUS) {
        public int getCalculateValue(int operand1, int operand2) {
            return operand1 + operand2;
        }
    },
    MINUS(Operator.MINUS) {
        public int getCalculateValue(int operand1, int operand2) {
            return operand1 - operand2;
        }
    },
    MULTIPLY(Operator.MULTIPLY) {
        public int getCalculateValue(int operand1, int operand2) {
            return operand1 * operand2;
        }
    },
    DIVIDE(Operator.DIVIDE) {
        public int getCalculateValue(int operand1, int operand2) {
            return operand1 / operand2;
        }
    };

    private Operator operator;

    CalculatorFactory(Operator operator) {
        this.operator = operator;
    }

    public static CalculatorFactory findByOperator(Operator operator) {
        return Arrays.stream(values())
                .filter(calculatorFactory -> calculatorFactory.operator.equals(operator))
                .findAny().orElseThrow(() -> new CalculatorException(Error.NOT_FOUND_OPERATOR));
    }

    public abstract int getCalculateValue(int operand1, int operand2);
}
