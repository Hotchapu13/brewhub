public class VanillaSyrup extends CondimentDecorator {

    public VanillaSyrup(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription(){
        return "Vanilla Syrup";
    }

    @Override
    public double cost(){
        return .25 + beverage.cost();
    }
}