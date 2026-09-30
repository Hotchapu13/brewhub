# Observer Pattern: Live Order and Inventory Dashboards

## Why the design choice?
This milestone required the observer design pattern since three different parts of the entire BrewHub system required data from a single source of truth for them to be utilized for their functions. This created the need for a subject-observer paradigm where mutliple observers are notified when the subject changes state.

## Push vs Pull: Do you send full order data, or let observers ask for it? Justify your choice

All three observers currently read the same order status field, so push and pull deliver the same information today; `InventoryTracker` uses fewer of that field's values than `KitchenDisplay` or `CustomerNotifier` do. 

Under push, `update()`'s signature has to change every time a new kind of observer needs a new kind of information. For example, adding an `AuditLogger` that wants a timestamp of when the status changed would mean changing what gets passed to every existing observer, whether they care about timestamps or not. Under pull, `OrderStatusPublisher` just exposes a new getter, and `AuditLogger` calls it; `KitchenDisplay`, `CustomerNotifier`, and `InventoryTracker` need no changes at all.

Pull was chosen so that `OrderStatusPublisher` can accommodate new kinds of exposed data over time without forcing every observer's `update()` to be touched. Observers stay coupled only to the specific getters they actually call, not to a shared payload shape.

