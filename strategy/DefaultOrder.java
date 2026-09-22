public class DefaultOrder extends Order{
    public DefaultOrder(){
        pricingStrategy = new NoDiscount();
    }

    public void display(){
        System.out.println("No discount has been applied");
    }
}