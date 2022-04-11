package errorHandling;

public class InvalidHigherTotalAmount extends IllegalArgumentException {

    public InvalidHigherTotalAmount(String s) {
        super(s);
    }
}
