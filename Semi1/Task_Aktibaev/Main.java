package Semi1.Task_Aktibaev;

public class Main {
    public static void main(String[] args) {
        VendingMachine2 vendingMachine2 = new VendingMachine2();
        Product2 product1 = new Product2("Milka", 80);
        Product2 product2 = new Product2("Milka2", 80);
        Product2 product3 = new Bottle("Fanta", 120, 2);

        vendingMachine2.addProduct2(product1);
        vendingMachine2.addProduct2(product2);
        vendingMachine2.addProduct2(product3);

        System.out.println(vendingMachine2.getProducByCost(190));
    }
}
