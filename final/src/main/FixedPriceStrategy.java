package main;

public class FixedPriceStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double basePrice) {
        return basePrice;
    }

    @Override
    public String getStrategyName() {
        return "Fixed Price";
    }

    // Additional function specific to FixedPriceStrategy
    public void setFixedPrice(double fixedPrice) {
        System.out.println("FixedPriceStrategy: Setting fixed price to $" + fixedPrice);
    }
}