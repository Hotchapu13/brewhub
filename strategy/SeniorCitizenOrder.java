public class SeniorCitizenOrder extends Order{
    public SeniorCitizenOrder(){
        pricingStrategy = new NoDiscount();
    }

    public void finish(){
        System.out.println("Only senior citizens are eligible for this discount");
    }
}