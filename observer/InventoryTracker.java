public class InventoryTracker implements Observer, DisplayElement {

    private OrderStatusPublisher orderStatusPublisher;
    private boolean queued;
    private boolean brewing;
    private boolean ready;

    public InventoryTracker(OrderStatusPublisher orderStatusPublisher){
        this.orderStatusPublisher = orderStatusPublisher;
        orderStatusPublisher.registerObserver(this);
    }

    @Override
    public void update(boolean queued, boolean brewing, boolean ready) {
        this.queued = queued;
        this.brewing = brewing;
        this.ready = ready;
    }

    @Override
    public String toString() {
        return "InventoryTracker";
    }
    
    @Override
    public void display(){
        System.out.println("We have used up these ingredients. These are the ingredients that are left");
    }
}