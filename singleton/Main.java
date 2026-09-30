import singleton.OrderLedger.Order;

public class Main {
    public static void main(String[] args) {
        OrderLedger ledger1 = OrderLedger.getInstance();
        OrderLedger ledger2 = OrderLedger.getInstance();

        ledger1.addOrder(new Order("101", "Apple", 1.50, "BUY"));
        ledger2.addOrder(new Order("102", "Banana", 0.80, "SELL"));

        System.out.println("Are both references identical? " + (ledger1 == ledger2));
        ledger1.printLedger();
    }
}