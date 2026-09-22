public class LoyaltyTierDiscount implements PricingStrategy{

    @Override
    public double calculateTotal(double subtotal) {
        subtotal = subtotal * 0.1;
        return subtotal;
    }
    
}