package main;

public class DiscountedProductDecorator extends Product {
    private double discount;

    public DiscountedProductDecorator(Product product, double discount) {
        super(product.getName(), product.getPrice());
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        return super.getPrice() - discount;
    }
}