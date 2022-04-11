package inheritanceInterfece.invoice;

import inheritanceInterfece.interfaces.TradeInvoiceCalculation;
import inheritanceInterfece.order.Order;
import inheritanceInterfece.order.TradeOrder;

public class TradeInvoice extends Invoice implements TradeInvoiceCalculation {
    //private TradeOrder tradeOrder;

    public TradeInvoice(TradeOrder tradeOrder) {
        super(tradeOrder);
        //this.tradeOrder = tradeOrder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Trade invoice:");
        sb.append(System.lineSeparator());
        sb.append(String.format("orderPrice without VAT : %.3f", calculateInvoiceArticlePricesWithoutVAT()));
        sb.append(System.lineSeparator());
        sb.append(String.format("orderPrice with VAT : %.3f", calculateInvoiceArticlePricesWithVAT()));
        sb.append(System.lineSeparator());
        sb.append(String.format("orderPrice with VAT after discount: %.3f", calculateInvoiceArticlePricesWithVAT() - tradeInvoiceDiscount()));

        return sb.toString().trim();
    }

    @Override
    public double tradeInvoiceDiscount() {
        return super.calculateInvoiceArticlePricesWithoutVAT() * 0.1;
    }

//    @Override
//    public double calculateInvoiceArticlePricesWithVAT() {
//        return super.calculateInvoiceArticlePricesWithVAT();
//    }
//
//    @Override
//    public double calculateInvoiceArticlePricesWithoutVAT() {
//        return super.calculateInvoiceArticlePricesWithoutVAT();
//    }
}
