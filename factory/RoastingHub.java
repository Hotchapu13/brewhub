public abstract class RoastingHub {
    // SimpleBeanFactory factory;

    // public RoastingHub(SimpleBeanFactory factory) {
    //     this.factory = factory;
    // }

    protected abstract Bean sourceBean(String type);

    public Bean orderBean(String type){
        Bean bean;

        bean = sourceBean(type);

        bean.dry();
        bean.brown();
        bean.crack();
        bean.pack();

        return bean;
    }
}