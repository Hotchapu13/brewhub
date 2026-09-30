public class BrewHubCafe {
    public static void main(String[] args){
        OrderStatusPublisher statusPublisher = new OrderStatusPublisher("101");

        // Instantiate the concrete observer objects
        KitchenDisplay kitchenDisplay = new KitchenDisplay(statusPublisher);
        CustomerNotifier customerNotifier = new CustomerNotifier(statusPublisher);
        InventoryTracker inventoryTracker = new InventoryTracker(statusPublisher);

        // The OrderLedger singleton also observes order status, and only
        // records a transaction once the order reaches READY.
        OrderLedger ledger = OrderLedger.getInstance();
        ledger.subscribeTo(statusPublisher);

        System.out.println(statusPublisher.showSubscribers());

        statusPublisher.setStatus(OrderStatusPublisher.Status.QUEUED);
        statusPublisher.setStatus(OrderStatusPublisher.Status.BREWING);
        statusPublisher.setStatus(OrderStatusPublisher.Status.READY);

        statusPublisher.removeObserver(inventoryTracker);
        System.out.println(statusPublisher.showSubscribers());
        statusPublisher.setStatus(OrderStatusPublisher.Status.BREWING);

        ledger.printLedger();
    }
}