public class StudentOrder extends Order{
    public StudentOrder(){
        // Use student discount class to handle applyDiscount
        pricingStrategy = new StudentDiscount();
        
    }

    public void finish(){
        System.out.println("A student discount has been applied. Subtotal is: ");
    }
}