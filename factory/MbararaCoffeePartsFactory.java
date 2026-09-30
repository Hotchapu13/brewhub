public class MbararaCoffeePartsFactory implements CoffeePartsFactory{

    @Override
    public Milk createMilk() {
        return new FreshMilk();
    }

    @Override
    public Cup createCup() {
       return PaperCup();
    }

    @Override
    public Bean createBean() {
        return new Bean();
    }
    
}