public abstract class Order{
    // Each order should have a reference to sth that implements the PricingStrategy interface
    private PricingStrategy pricingStrategy;
    double price;

    public void applyDiscount(double price){
        pricingStrategy.calculateTotal(price);
    }

}