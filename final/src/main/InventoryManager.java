package main;

import java.util.HashMap;
import java.util.Map;

// Class for Inventory Manager. It implements Singleton design pattern.
public class InventoryManager {
    private static InventoryManager instance;
    private Map<String, Integer> inventory;

    private InventoryManager() {
        // Private constructor to prevent instantiation.
    	
        inventory = new HashMap<>();
    }

    public static InventoryManager getInstance() {
        if (instance == null) {
            instance = new InventoryManager();
        }
        return instance;
    }

    public void addProduct(String productName, int quantity) {
        if (inventory.containsKey(productName)) {       	
            // If the product already exists, update the quantity

            int currentQuantity = inventory.get(productName);
            inventory.put(productName, currentQuantity + quantity);
        } else {
            // If the product is new, add it to the inventory
        	
            inventory.put(productName, quantity);
        }
        System.out.println(quantity + " units of " + productName + " added to the inventory.");
    }

    public void checkInventory() {
        System.out.println("Current Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " units");
        }
    }

    public void sellProduct(String productName, int quantity) {
        if (inventory.containsKey(productName)) {
            int availableQuantity = inventory.get(productName);
            if (availableQuantity >= quantity) {
                // If there are enough units, sell the product
            	
                inventory.put(productName, availableQuantity - quantity);
                System.out.println(quantity + " units of " + productName + " sold.");
            } else {
                System.out.println("Not enough units of " + productName + " in the inventory.");
            }
        } else {
            System.out.println("Product " + productName + " not found in the inventory.");
        }
    }
}