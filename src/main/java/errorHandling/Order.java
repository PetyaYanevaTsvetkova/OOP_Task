package errorHandling;

import java.util.List;

public class Order {

    private int orderNumber;
    private String clientDetails;
    private List<Double> articlesPrices;
    private double totalAmount;

    public Order() {
    }

    public Order(double totalAmount) throws InvalidTotalAmountException {
        setTotalAmount(totalAmount);
    }

    public void setTotalAmount(double totalAmount) throws InvalidTotalAmountException, InvalidHigherTotalAmount {

        try {
            this.totalAmount = ValidateTotalAmount.validateAndSetTotalAmount(totalAmount);
        } catch (InvalidTotalAmountException ex) {
            System.out.println("Invalid value " + ex.getMessage());
        } catch (InvalidHigherTotalAmount ex) {
            System.out.println("Invalid higher value " + ex.getMessage());
        } finally {
            System.out.println(this.totalAmount);
            System.out.println("Execute finally code");
        }
    }

    public double getTotalAmount() {
        return this.totalAmount;
    }
}
