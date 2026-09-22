public class LoyaltyTierOrder extends Order{
    public LoyaltyTierOrder(){
        pricingStrategy = new LoyaltyTierDiscount();
    }

    public void display(){
        System.out.println("A loyalty tier discount has been applied");
    }
}