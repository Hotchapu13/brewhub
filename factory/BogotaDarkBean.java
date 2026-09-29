public class BogotaDarkBean extends Bean {
    public BogotaDarkBean(){
        name = "Bogota dark bean";
        roastLevel = "Dark";
        species = "Liberica";

        System.out.println("Sourced " + getName());
    }
}