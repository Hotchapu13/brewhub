public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription(){
        return beverage.getDescription() + ", whip";
    }

    @Override 
    public double cost(){
        return .10 + beverage.cost();
    }
}