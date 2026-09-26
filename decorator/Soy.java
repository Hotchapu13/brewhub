public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription(){
        return beverage.getDescription() + ", soy";
    }

    @Override
    public double cost(){
        return .15 + beverage.cost();
    }
}