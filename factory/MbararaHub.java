public class MbararaHub extends RoastingHub {

    @Override 
    public Bean sourceBean(String type){
        if (type.equals("dark")){
            return new MbararaDarkBean();
        } else if (type.equals("medium")){
            return new MbararaMediumBean();
        }else if (type.equals("light")){
            return new MbararaLightBean();
        } else return null;
    }
}