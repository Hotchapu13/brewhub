public abstract class Order{
    private PricingStrategy strategy;

    public void applyDiscount(double price){
        strategy.calculateTotal(0);
    }

}