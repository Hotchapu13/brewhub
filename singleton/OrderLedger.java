import java.util.*;

public class OrderLedger {

    private static final OrderLedger INSTANCE = new OrderLedger();

    public static class Order {
        public String id;
        public String item;
        public double price;
        public String type; // "BUY" or "SELL"

        public Order(String id, String item, double price, String type) {
            this.id = id;
            this.item = item;
            this.price = price;
            this.type = type;
        }

        @Override
        public String toString() {
            return type + " Order [ID=" + id + ", Item=" + item + ", Price=$" + price + "]";
        }
    }

    // list of orders
    private final List<Order> orders;

    private OrderLedger(){
        this.orders = Collections.synchronizedList(new ArrayList<>());
    }

    public static OrderLedger getInstance(){
        return INSTANCE;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return new ArrayList<>(orders);
    }

    public void printLedger() {
        System.out.println("--- GLOBAL ORDER LEDGER ---");
        synchronized (orders) {
            for (Order order : orders) {
                System.out.println(order);
            }
        }
    }

}