package oopTask;

public class OrderSession {
    public static void main(String[] args) {

        Order order1 = new Order(2023,150,false, 10, 5,"Pesho");
        Order order2 = new Order(2025,15000,false, 20, 7,"Misho");

        System.out.println(order1);
        System.out.println(order1);
        System.out.println("------------------------------------------------------------");
        System.out.println("After use methods:");

        order1.setEOrder(true);
        order2.usedPages(4.5);
        order1.changeEmploySignature("Tosho");
        order1.usedPages(5);

        System.out.println(order1.toString());
        System.out.println(order2.toString());
    }
}
