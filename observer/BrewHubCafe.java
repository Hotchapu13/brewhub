public class BrewHubCafe {
    public static void main(String[] args){
        OrderStatusPublisher statusPublisher = new OrderStatusPublisher();

        KitchenDisplay kitchenDisplay = new KitchenDisplay(statusPublisher);
        CustomerNotifier customerNotifier = new CustomerNotifier(statusPublisher);
        InventoryTracker inventoryTracker = new InventoryTracker(statusPublisher);

        System.out.println(statusPublisher.showSubscribers());

        statusPublisher.setStatus(true, false, false);
        statusPublisher.setStatus(false, true, false);
        statusPublisher.setStatus(false, false, true);

        statusPublisher.removeObserver(inventoryTracker);
        System.out.println(statusPublisher.showSubscribers());
    }
}