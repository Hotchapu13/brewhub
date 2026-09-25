public class InventoryTracker implements Observer, DisplayElement {

    private OrderStatusPublisher orderStatusPublisher;

    public InventoryTracker(OrderStatusPublisher orderStatusPublisher){
        this.orderStatusPublisher = orderStatusPublisher;
        orderStatusPublisher.registerObserver(this);
    }

    @Override
    public void update() {
        OrderStatusPublisher.Status status = orderStatusPublisher.getStatus();
        display(status);
    }

    @Override
    public String toString() {
        return "InventoryTracker";
    }

    @Override 
    public void display(OrderStatusPublisher.Status status){
       if(status == OrderStatusPublisher.Status.BREWING){
        System.out.println("Deducting ingredient stock.");
       }
        
    }
}