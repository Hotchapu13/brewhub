// Implement main here
// Make sure to implement concrete classes to inherit from the abstract Order class 
public class BrewHubSimulator{
    public static void main(String[] args){

        // Create order objects
        // Order defaultOrder = new DefaultOrder();
        // Order student = new StudentOrder();
        // Order happyHourOrder  = new HappyHourOrder();
        // Order loyaltyTierOrder = new LoyaltyTierOrder();

        // // Compute discounted prices
        // double defaultPrice = defaultOrder.applyDiscount(200);
        // double studentPrice = student.applyDiscount(200);
        // double happyHourPrice = happyHourOrder.applyDiscount(200);
        // double loyaltyPrice = loyaltyTierOrder.applyDiscount(200);


        // System.out.println("Your first purchase. This will cost $" + defaultPrice);
        // System.out.println("Student discount applied. Total price is: $" + studentPrice + ".");
        // System.out.println("It's Happy Hour!! Coffee costs $" + happyHourPrice);
        // System.out.println("You're a loyal customer. Your coffee will cost $" + loyaltyPrice);

        Order seniorOrder = new SeniorCitizenOrder();

        double seniorPrice = seniorOrder.applyDiscount(200);

        System.out.println("Senior pays $" + seniorPrice);

        // Change strategy at runtime
        seniorOrder.setStrategy(new StudentDiscount());
        double seniorPrice1 = seniorOrder.applyDiscount(200);
        System.out.println("Senior on student discount pays $" + seniorPrice1);

        seniorOrder.setStrategy(new SeniorCitizenDiscount());
        double seniorPrice2 = seniorOrder.applyDiscount(200);
        System.out.println("Senior on senior discount pays $" + seniorPrice2);


    }
}