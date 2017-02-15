package mt.exception;

public class UnknownSequenceException extends Exception {
    public UnknownSequenceException() {
        super();
    }

    public UnknownSequenceException(String message) {
        super(message);
    }

    public UnknownSequenceException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnknownSequenceException(Throwable cause) {
        super(cause);
    }
}
