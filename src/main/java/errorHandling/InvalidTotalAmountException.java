package errorHandling;

public class InvalidTotalAmountException extends Exception {

    public InvalidTotalAmountException(String message) {
        super(message);
    }
}
