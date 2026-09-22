public class HappyHourOrder extends Order{
    public HappyHourOrder(){
        pricingStrategy = new HappyHourDiscount();
    }

    public void finish(){
        System.out.println("It's Happy hour. Here's your happy hour discount");
    }
}