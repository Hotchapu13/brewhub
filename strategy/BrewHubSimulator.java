// Implement main here
// Make sure to implement concrete classes to inherit from the abstract Order class 
public class BrewHubSimulator{
    public static void main(String[] args){
        Order student = new StudentOrder();

        double studentPrice = student.applyDiscount(200);
        
        System.out.println("Student discount applied. Total price is: $" + studentPrice + ".");
    }
}