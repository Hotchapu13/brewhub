public class SeattleHub extends RoastingHub {

    @Override
    public Bean createBean(String type){
        Bean bean;

        if(type.equals("dark")){
            return new SeattleDarkBean();
        }else if (type.equals("medium")){
            return new SeattleMediumBean();
        }else if (type.equals("light")) {
            return new SeattleLightBean();
        } else return null;
    }
}