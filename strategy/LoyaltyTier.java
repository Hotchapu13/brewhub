public class LoyaltyTier implements PricingStrategy{

    @Override
    public double calculateTotal(double subtotal) {
        return subtotal * 0.1;
    }
    
}