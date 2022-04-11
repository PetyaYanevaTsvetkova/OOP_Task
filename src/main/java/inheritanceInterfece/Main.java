package inheritanceInterfece;

import inheritanceInterfece.invoice.CustomerInvoice;
import inheritanceInterfece.invoice.Invoice;
import inheritanceInterfece.invoice.TradeInvoice;
import inheritanceInterfece.order.CustomerOder;
import inheritanceInterfece.order.Order;
import inheritanceInterfece.order.TradeOrder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//Inheritance exercise:
        Order tradeOrderT = new TradeOrder(1, "Opel", List.of(1.5, 2.5, 3.6));
        Order tradeOrderInstance = new TradeOrder();
        System.out.println(tradeOrderT.hashCode());
        System.out.println(tradeOrderT.equals(tradeOrderT));
        System.out.println(tradeOrderT.equals(tradeOrderInstance));

        System.out.println("-------------------------------------");

        //Interface exercise:
        Order customerOrder = new CustomerOder(1, "Pesho", List.of(1524.6, 7.5, 0.6));
        TradeOrder tradeOrder = new TradeOrder(2, "Opel", List.of(1.5, 2.5, 3.6));

        Invoice customerInvoice = new CustomerInvoice(customerOrder);
        Invoice tradeInvoice = new TradeInvoice(tradeOrder);

        System.out.println(customerInvoice.toString());
        System.out.println("-------------------------------------");
        System.out.println(tradeInvoice.toString());
    }
}
