public class BrewHubCoffee{
    public static void main(String[] args){
        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        
    }
}