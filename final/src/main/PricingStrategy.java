package main;

// Interface for the Pricing Strategy.
public interface PricingStrategy {
	 double calculatePrice(double basePrice);
	
	 // Additional function to get the strategy name
	 String getStrategyName();
}
