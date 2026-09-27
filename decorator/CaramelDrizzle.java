public class CaramelDrizzle extends CondimentDecorator {

    public CaramelDrizzle(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Caramel Drizzle";
    }

    @Override
    public double cost() {
        return .30 + beverage.cost();
    }
    
}