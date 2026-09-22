public class DefaultOrder extends Order{
    public DefaultOrder(){
        pricingStrategy = new NoDiscount();
    }

    public void finish(){
        System.out.println("No discount has been applied");
    }
}