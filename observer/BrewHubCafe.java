public class BrewHubCafe {
    public static void main(String[] args){
        OrderStatusPublisher statusPublisher = new OrderStatusPublisher();

        // Instantiate the concrete observer objects
        KitchenDisplay kitchenDisplay = new KitchenDisplay(statusPublisher);
        CustomerNotifier customerNotifier = new CustomerNotifier(statusPublisher);
        InventoryTracker inventoryTracker = new InventoryTracker(statusPublisher);

        System.out.println(statusPublisher.showSubscribers());

        statusPublisher.setStatus(OrderStatusPublisher.Status.QUEUED);
        statusPublisher.setStatus(OrderStatusPublisher.Status.BREWING);
        statusPublisher.setStatus(OrderStatusPublisher.Status.READY);

        statusPublisher.removeObserver(inventoryTracker);
        System.out.println(statusPublisher.showSubscribers());
        statusPublisher.setStatus(OrderStatusPublisher.Status.BREWING);
    }
}