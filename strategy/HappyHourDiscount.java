public class HappyHourDiscount implements PricingStrategy{

    @Override
    public double calculateTotal(double subtotal) {
        return subtotal - (subtotal * 0.25);
    }

}