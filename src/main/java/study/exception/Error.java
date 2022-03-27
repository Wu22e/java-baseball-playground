package study.exception;

public enum Error {

    NOT_FOUND_OPERATOR("Could not found operator");

    private final String message;

    Error(String message) {
        this.message = message;
    }
}
