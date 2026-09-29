public class CoffeeOrderTest {
    public static void main(String[] args){
        RoastingHub mbararaRoastingHub = new MbararaHub();
        RoastingHub seattleRoastingHub = new SeattleHub();
        RoastingHub bogotaRoastingHub = new BogotaHub();

        Bean bean1 = mbararaRoastingHub.orderBean("dark");
        Bean bean2 =  seattleRoastingHub.orderBean("medium");
        Bean bean3 = bogotaRoastingHub.orderBean("light");

        System.out.println("I have ordered for " + bean1.getName() + "\n");

        System.out.println("I have ordered for " + bean2.getName() + "\n");

        System.out.println("I have ordered for " + bean3.getName() + "\n");



    }
}