# Singleton: One Central Order Ledger

## Why the Eager Initialization Fix
The nature of an order ledger suggests that it would frequently be accessed, thus creating need for the getInstance() method to be regularly called. Implementing double checked locking or using synchronisation would slow down execution due to frequent lock checks or special memory checks. 

## What would go wrong if OrderLedger were not a Singleton, concretely?
In the case of an order ledger, we could hit a case where the two processes/threads might create their own ledgers and cause inconsistencies in the data. We lose the capability of having a sigle source of truth and could end up with fragmented states or data.