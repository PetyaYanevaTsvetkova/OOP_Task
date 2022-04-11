package inheritanceInterfece.order;

import inheritanceInterfece.interfaces.InvoiceCalculations;

import java.util.List;

public class CustomerOder extends Order {

    public CustomerOder(int orderNumber, String clientDetails, List<Double> articlesPrices) {
        super(orderNumber, clientDetails, articlesPrices);
    }
}
