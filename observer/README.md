# Observer Pattern: Live Order and Inventory Dashboards

## Why the design choice?
This milestone required the observer design pattern since three different parts of the entire BrewHub system required data from a single source of truth for them to be utilized for their functions. This created the need for a subject-observer paradigm where mutliple observers are notified when the subject changes state.

## Push vs Pull: Do you send full order data, or let observers ask for it? Justify your choice
In a real world system, KitchenDisplay, CustomerNotifier and InventoryTracker would require different slices of data from each other. It would be needless for the subject to send the full order data to all the observers because some parts of it will be used and the rest will probably go unused. 
The CustomerNotifier class is the only one that actually requires the exact data being provided by the OrderStatusPublisher class. The KitchenDisplay could require extra information such as special instructions from the person making the order, the ingredients required etc. and the InvontoryTracker class only needs to know when an order is brewing for it to know what ingredients are being used so that inventory records can be updated.

