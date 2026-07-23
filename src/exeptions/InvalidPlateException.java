package exeptions;

public class InvalidPlateException extends RuntimeException {
    public InvalidPlateException(String message) {
        super(message);
    }
}
