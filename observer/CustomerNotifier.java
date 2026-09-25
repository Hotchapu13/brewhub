public class CustomerNotifier implements Observer, DisplayElement {

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

        @Override
    public String toString() {
        return "CustomerNotifier";
    }
    
    @Override 
    public void display(){
        if (queued){
            System.out.println("Your coffee has been sent in for preparation.");
        }else if (brewing) {
            System.out.println("Your coffee is being prepared.");
        }else if (ready){
            System.out.println("Your coffee is ready.");
        }
        
    }

}