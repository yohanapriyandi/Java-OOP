package ardhastudio.model;

import ardhastudio.data.Product;

public class ModelApp {
    public static void main(String[] args) {
        Product product = new Product("Macbook m1", 25_000_000);

        System.out.println(product.name);
        System.out.println(product.price);
    }
}
