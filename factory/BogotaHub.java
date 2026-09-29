public class BogotaHub extends RoastingHub{

    @Override
    public Bean sourceBean(String type){
        Bean bean;

        if(type.equals("dark")){
            return new BogotaDarkBean();
        }else if (type.equals("medium")){
            return new BogotaMediumBean();
        }else if (type.equals("light")) {
            return new BogotaLightBean();
        }else return null;
    }
}