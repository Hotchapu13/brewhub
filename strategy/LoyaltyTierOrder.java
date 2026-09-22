public class LoyaltyTierOrder extends Order{
    public LoyaltyTierOrder(){
        pricingStrategy = new LoyaltyTierDiscount();
        loyaltytier = new LoyaltyTierDiscount();
    }

    public void finish(){
        System.out.println("A loyalty tier discount has been applied");
    }
}