package study.exception;

public class CalculatorException extends RuntimeException {

    private final Error error;

    public CalculatorException(Error error) {
        this.error = error;
    }
}
