public class BogotaCoffeePartsFactory implements CoffeePartsFactory{

    @Override
    public Milk createMilk() {
        return new PowderedMilk();
    }

    @Override
    public Cup createCup() {
        return new MetalCup();
    }

    @Override
    public Bean createBean() {
        return new Bean();
    }
    
}