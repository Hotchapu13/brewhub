# Decorator: Build-Your-Own-Drink Pricing

## Why the design choice?


## State one thing this design makes easy that subclassing every combination would not.
- The decorator pattern makes it easy to add condiments to drinks at runtime withough having
to create separate sublasses for every combination. Subclassing every combination causes 
class explosion which would make the code more complex, and less maintanable. 

- It also makes it easier to add condiments at runtime. If the user wanted to add another shot of mocha to a base beverage, they would be unable to do that at runtime since the subclasses are already fixed at compile time.
