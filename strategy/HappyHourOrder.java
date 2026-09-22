public class HappyHourOrder extends Order{
    public HappyHourOrder(){
        pricingStrategy = new HappyHour();
    }

    public void finish(){
        System.out.println("It's Happy hour. Here's your happy hour discount");
    }
}