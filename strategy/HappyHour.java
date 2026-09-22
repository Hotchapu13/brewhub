public class HappyHour implements PricingStrategy{

    @Override
    public double calculateTotal(double subtotal) {
        subtotal = subtotal * 0.25;

        return subtotal;
    }

}