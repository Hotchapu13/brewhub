public abstract class RoastingHub {
    SimpleBeanFactory factory;

    // public RoastingHub(SimpleBeanFactory factory) {
    //     this.factory = factory;
    // }

    abstract Bean createBean(String type);
    
    public Bean orderBean(String type){
        Bean bean;

        bean = createBean(type);

        bean.dry();
        bean.brown();
        bean.crack();
        bean.pack();

        return bean;
    }
}