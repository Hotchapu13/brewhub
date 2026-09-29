public class RoastingHub {
    SimpleBeanFactory factory;

    public RoastingHub(SimpleBeanFactory factory) {
        this.factory = factory;
    }

    Bean orderBean(String type){
        Bean bean;

        bean = factory.createBean(type);

        bean.dry();
        bean.brown();
        bean.crack();
        bean.pack();
    }
}