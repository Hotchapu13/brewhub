public class KitchenDisplay implements Observer, DisplayElement{
    private OrderStatusPublisher orderStatusPublisher;
    private boolean queued;
    private boolean brewing;
    private boolean ready;

    public KitchenDisplay(OrderStatusPublisher orderStatusPublisher){
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
        return "KitchenDisplay";
    }

    @Override
    public void display(){
        System.out.println("We need these ingredients");
    }
}