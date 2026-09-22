public class StudentDiscount implements PricingStrategy{

    @Override
    public double calculateTotal(double subtotal) {
        subtotal = subtotal * 0.3;
        return subtotal * 0.3;
    }

}