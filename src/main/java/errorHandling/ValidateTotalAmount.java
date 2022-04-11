package errorHandling;

public class ValidateTotalAmount {

    static double validateAndSetTotalAmount(double totalAmount) throws InvalidTotalAmountException {
        if (totalAmount < 0) {
            throw new InvalidTotalAmountException("Amount can't be negative " + totalAmount);
        } else if (totalAmount > 100) {
            throw new InvalidHigherTotalAmount("Total amount can't be under hundred " + totalAmount);
        } else {
            System.out.println("Valid total amount");
            return totalAmount;
        }
    }
}
