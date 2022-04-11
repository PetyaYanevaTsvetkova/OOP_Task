package inheritanceInterfece.invoice;

import inheritanceInterfece.order.Order;

public class CustomerInvoice extends Invoice {

    public CustomerInvoice(Order order) {
        super(order);
    }

}
