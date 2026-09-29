import java.util.*;

public abstract class Bean {
    String name;
    String roastLevel;
    String species;


    public void dry(){
        System.out.println("Preparing " + name);
        System.out.println("Spreading the beans...");
        System.out.println("Beans drying...");
    };

    public void brown(){
        System.out.println("Browning coffee beans...");
    };

    public void crack(){
        System.out.println("Cracking coffee beans...");
    };

    public void pack(){
        System.out.println("Packing coffee beans in their bags...");
    };

    public String getName(){
        return name;
    }

}