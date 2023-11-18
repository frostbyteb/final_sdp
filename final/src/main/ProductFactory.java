package main;

// Class for Product Factory. It implements Factory design pattern.
public class ProductFactory {
    public static Product createProduct(String type, String name, double price) {
        if ("Discounted".equals(type)) {
            return new DiscountedProductDecorator(new Product(name, price), 5.0);
        } else {
            return new Product(name, price);
        }
    }
}