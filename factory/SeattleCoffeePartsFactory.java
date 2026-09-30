public class SeattleCoffeePartsFactory implements CoffeePartsFactory{

    @Override
    public Milk createMilk() {
        return new PasteurizedMilk();
    }

    @Override
    public Cup createCup() {
        return new PlasticCup();
    }

    @Override
    public Bean createBean() {
        return new Bean();
    }
    
}