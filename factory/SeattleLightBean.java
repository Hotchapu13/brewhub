public class SeattleLightBean extends Bean {
    public SeattleLightBean(){
        name = "Seattle light bean";
        roastLevel = "Light";
        species = "Arabica";

        System.out.println("Sourced " + getName());
    }
}