// Implement main here
// Make sure to implement concrete classes to inherit from the abstract Order class 
public class BrewHubSimulator{
    public static void main(String[] args){
        Order student = new StudentOrder();

        student.applyDiscount(200);
    }
}