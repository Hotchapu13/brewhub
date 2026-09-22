public class SeniorCitizenDiscount implements PricingStrategy{

    @Override
    public double calculateTotal(double subtotal) {
        return subtotal - (subtotal * 0.4);
    }

}