package main;

// Class for Customer. It implements Observer design pattern.
public class Customer implements ProductObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(Product product) {
        System.out.println(name + ": Notified about the availability of " + product.getName() + " at $" + product.getPrice());
    }
}