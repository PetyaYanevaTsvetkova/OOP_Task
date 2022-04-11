package errorHandling;

public class RethrowException {

    public static void exceptionFromFirstMethod() throws IllegalArgumentException {
        System.out.println("The Exception in First() method");
        throw new IllegalArgumentException("thrown from first() method");
    }

    public static void methodSecond() throws Throwable {
        try {
            exceptionFromFirstMethod();
        } catch (IllegalArgumentException e) {
            System.out.println("Inside second() method");
            throw e;
        }
    }
}
