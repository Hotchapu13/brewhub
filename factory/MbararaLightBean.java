public class MbararaLightBean extends Bean {
    public MbararaLightBean(){
        name = "Mbarara dark bean";
        roastLevel = "Light";
        species = "Robusta";

        System.out.println("Sourced " + getName());
    }
}