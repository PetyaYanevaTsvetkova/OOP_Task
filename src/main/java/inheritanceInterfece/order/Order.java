package inheritanceInterfece.order;

import inheritanceInterfece.interfaces.InvoiceCalculations;

import java.util.List;

public abstract class Order  {
    private static final String ORDER_NAME = "Order";

    private int orderNumber;
    private String clientDetails;
    private List<Double> articlesPrices;
    private double totalAmount;

    public Order() {
    }

    public Order(int orderNumber, String clientDetails, List<Double> articlesPrices) {
        this.orderNumber = orderNumber;
        this.clientDetails = clientDetails;
        this.articlesPrices = articlesPrices;
        setTotalAmount();
    }

    public Order(int orderNumber, String clientDetails) {
        this.orderNumber = orderNumber;
        this.clientDetails = clientDetails;
    }


    public double getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount() {
        this.totalAmount = this.articlesPrices
                .stream()
                .mapToDouble(Double::doubleValue)
                .sum();
    }

//    @Override
//    public double calculateInvoiceArticlePricesWithVAT() {
//        return getTotalAmount() * 1.2;
//    }
//
//    @Override
//    public double calculateInvoiceArticlePricesWithoutVAT() {
//        return getTotalAmount();
//    }
}
