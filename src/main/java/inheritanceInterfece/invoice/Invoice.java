package inheritanceInterfece.invoice;

import inheritanceInterfece.interfaces.InvoiceCalculations;
import inheritanceInterfece.order.Order;

public abstract class Invoice implements InvoiceCalculations {
    private Order order;

    public Invoice(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Invoice:");
        sb.append(System.lineSeparator());
        sb.append(String.format("orderPrice without VAT : %.3f", calculateInvoiceArticlePricesWithoutVAT()));
        sb.append(System.lineSeparator());
        sb.append(String.format("orderPrice with VAT : %.3f", calculateInvoiceArticlePricesWithVAT()));

        return sb.toString().trim();
    }

    @Override
    public double calculateInvoiceArticlePricesWithVAT() {
        return order.getTotalAmount() * 1.2;
    }

    @Override
    public double calculateInvoiceArticlePricesWithoutVAT() {
        return order.getTotalAmount();
    }

}
