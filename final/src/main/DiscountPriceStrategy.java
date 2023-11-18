package main;

public class DiscountPriceStrategy implements PricingStrategy {
	private double discountPercentage;

    public DiscountPriceStrategy(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculatePrice(double basePrice) {
        return basePrice - (basePrice * discountPercentage / 100);
    }

    @Override
    public String getStrategyName() {
        return "Discounted Price";
    }

    // Additional function specific to DiscountPriceStrategy
    public void setDiscountPercentage(double discountPercentage) {
        System.out.println("DiscountPriceStrategy: Setting discount percentage to " + discountPercentage + "%");
    }
}