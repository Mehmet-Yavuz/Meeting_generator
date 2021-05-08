package be.pxl.rp_backend.exception;

public class InvalidInputException extends RuntimeException {

    public InvalidInputException(String exception) {
        super(exception);
    }
}
