public class HappyHour implements PricingStrategy{

    @Override
    public double calculateTotal(double subtotal) {
        return subtotal * 0.25;
    }

}