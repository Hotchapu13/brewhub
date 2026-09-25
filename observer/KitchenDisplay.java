public class KitchenDisplay implements Observer, DisplayElement{
    private OrderStatusPublisher orderStatusPublisher;

    public KitchenDisplay(OrderStatusPublisher orderStatusPublisher){
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
        return "KitchenDisplay";
    }

    @Override 
    public void display(OrderStatusPublisher.Status status){
       switch (status) {
        case QUEUED:
            System.out.println("Move order to active station");
            break;
        case BREWING:
            System.out.println("Start Preparation timer");
            break;
        case READY:
            System.out.println("Clear order from kitchen view");
       }
        
    }
}