public class LoyaltyTierDiscount implements PricingStrategy{

    @Override
    public double calculateTotal(double subtotal) {
        return subtotal - (subtotal * 0.1);
    }
    
}