package main;

public class SupplierAdapter extends Product {
    private ThirdPartySupplier thirdPartySupplier;

    public SupplierAdapter(ThirdPartySupplier thirdPartySupplier) {
        super("Third-Party Product", 0); // Set initial price to 0
        this.thirdPartySupplier = thirdPartySupplier;
    }

    @Override
    public double getPrice() {
        return thirdPartySupplier.getPrice();
    }
}