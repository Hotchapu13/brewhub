public class CustomerNotifier implements Observer {

    private OrderStatusPublisher orderStatusPublisher;
    private boolean queued;
    private boolean brewing;
    private boolean ready;

    public CustomerNotifier(OrderStatusPublisher orderStatusPublisher){
        this.orderStatusPublisher = orderStatusPublisher;
        orderStatusPublisher.registerObserver(this);
    }

    @Override
    public void update(boolean queued, boolean brewing, boolean ready) {
        this.queued = queued;
        this.brewing = brewing;
        this.ready = ready;
    }
}