public class CustomerNotifier implements Observer, DisplayElement {

    private OrderStatusPublisher orderStatusPublisher;

    public CustomerNotifier(OrderStatusPublisher orderStatusPublisher){
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
        return "CustomerNotifier";
    }

    @Override 
    public void display(OrderStatusPublisher.Status status){
       switch (status) {
        case QUEUED:
            System.out.println("Order Received!");
            break;
        case BREWING:
            System.out.println("Your order is brewing");
            break;
        case READY:
            System.out.println("Your order is ready");
       }
        
    }

}