import java.util.*;

public class OrderLedger implements Observer {

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
    private OrderStatusPublisher activePublisher;

    private OrderLedger(){
        this.orders = Collections.synchronizedList(new ArrayList<>());
    }

    public static OrderLedger getInstance(){
        return INSTANCE;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    // Observer pattern: the ledger subscribes to an order's status updates
    // and only records the transaction once the order reaches READY.
    public void subscribeTo(OrderStatusPublisher publisher) {
        this.activePublisher = publisher;
        publisher.registerObserver(this);
    }

    @Override
    public void update() {
        if (activePublisher.getStatus() == OrderStatusPublisher.Status.READY) {
            addOrder(new Order(activePublisher.getOrderId(), "Coffee Order", 0.0, "SALE"));
        }
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