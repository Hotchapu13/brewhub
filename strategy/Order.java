public abstract class Order{
    // Each order should have a reference to sth that implements the PricingStrategy interface
    protected PricingStrategy pricingStrategy;
    double price;

    public double applyDiscount(double price){
        return pricingStrategy.calculateTotal(price);
    }

}