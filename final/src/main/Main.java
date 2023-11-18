package main;

public class Main {
    public static void main(String[] args) {
        // Singleton
        InventoryManager inventoryManager = InventoryManager.getInstance();

        // Add products to the inventory
        inventoryManager.addProduct("Laptop", 10);
        inventoryManager.addProduct("Smartphone", 20);
        inventoryManager.addProduct("Headphones", 30);

        // Check the current inventory
        inventoryManager.checkInventory();

        // Sell some products
        inventoryManager.sellProduct("Laptop", 5);
        inventoryManager.sellProduct("Smartphone", 15);

        // Check the updated inventory
        inventoryManager.checkInventory();
        
        System.out.println();
        
        // Strategy
        
        // Create instances of strategies
        PricingStrategy fixedPriceStrategy = new FixedPriceStrategy();
        PricingStrategy discountPriceStrategy = new DiscountPriceStrategy(10.0);

        // Calculate prices using different strategies
        double basePrice = 100.0;
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Fixed Price: $" + fixedPriceStrategy.calculatePrice(basePrice));
        System.out.println("Discounted Price: $" + discountPriceStrategy.calculatePrice(basePrice));

        // Demonstrate additional functions
        ((FixedPriceStrategy) fixedPriceStrategy).setFixedPrice(80.0);
        ((DiscountPriceStrategy) discountPriceStrategy).setDiscountPercentage(20.0);

        // Get strategy names
        System.out.println("Fixed Price Strategy: " + fixedPriceStrategy.getStrategyName());
        System.out.println("Discounted Price Strategy: " + discountPriceStrategy.getStrategyName());
        
        System.out.println();

        // Decorator
        Product regularProduct = new Product("Regular Product", 50.0);
        System.out.println("Regular Product Price: $" + regularProduct.getPrice());

        Product discountedProduct = new DiscountedProductDecorator(regularProduct, 10.0);
        System.out.println("Discounted Product Price: $" + discountedProduct.getPrice());
        
        System.out.println();

        // Adapter
        ThirdPartySupplier thirdPartySupplier = new ThirdPartySupplier();
        Product thirdPartyProduct = new SupplierAdapter(thirdPartySupplier);
        System.out.println("Third-Party Product Price: $" + thirdPartyProduct.getPrice());
        
        System.out.println();

        // Observer
        
        // Create instances of observers (customers)
        ProductObserver customer1 = new Customer("Customer 1");
        ProductObserver customer2 = new Customer("Customer 2");

        // Create a product notifier (subject)
        ProductNotifier productNotifier = new ProductNotifier();

        // Register observers (customers) with the product notifier
        productNotifier.addObserver(customer1);
        productNotifier.addObserver(customer2);

        // Simulate a new product being added and notify observers
        Product newProduct = new Product("New Product", 75.0);
        productNotifier.notifyObservers(newProduct);

        // Unregister an observer (customer)
        productNotifier.removeObserver(customer2);

        // Simulate another product and notify remaining observer
        Product discountedProductObserver = new DiscountedProductDecorator(new Product("Discounted Product", 50.0), 10.0);
        productNotifier.notifyObservers(discountedProductObserver);
        
        System.out.println();

        // Factory Method
        Product discountedProductFromFactory = ProductFactory.createProduct("Discounted", "Factory Discounted Product", 80.0);
        System.out.println("Discounted Product from Factory Price: $" + discountedProductFromFactory.getPrice());
    }
}
