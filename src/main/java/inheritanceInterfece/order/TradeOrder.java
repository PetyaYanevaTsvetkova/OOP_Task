package inheritanceInterfece.order;

import inheritanceInterfece.interfaces.TradeInvoiceCalculation;
import inheritanceInterfece.order.Order;

import java.util.List;

public class TradeOrder extends Order {

    public TradeOrder(int orderNumber, String clientDetails, List<Double> articlesPrices) {
        super(orderNumber, clientDetails, articlesPrices);
    }

    public TradeOrder() {
    }

}
