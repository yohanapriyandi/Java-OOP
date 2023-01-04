package ardhastudio.application;

import ardhastudio.data.Product;

public class ProductApp {
    public static void main(String[] args) {
        Product product1 = new Product("Macbook M1", 25_000_000);

        System.out.println(product1.name);
        System.out.println(product1.price);
        System.out.println(product1);

        System.out.println("===============================================");

        Product product2 = new Product("Macbook M1", 25_000_000);
        System.out.println(product2.name);
        System.out.println(product2.price);
        System.out.println(product2);

        System.out.println("================================================");

        System.out.println(product1.equals(product2));
        System.out.println(product1.hashCode() == product2.hashCode());

    }
}
