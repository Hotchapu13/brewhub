public class OrderLedger {

    private static OrderLedger uniqueInstance;

    private OrderLedger(){

    }

    public static OrderLedger getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new OrderLedger();
        }
        return uniqueInstance;
    }

}