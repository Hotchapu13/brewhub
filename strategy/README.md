# Strategy: Pricing and Loyalty Strategies

## Why the design choice?
I used the strategy design pattern because I identified that the context of an order could have variations (multiple types of discounts). That way, I could  separate them from what stays the same.  

## Why not just use if/else? 
- Using if/else statements violates the first principle of design (Identify what varies and separate them from what stays the same). We would have mutliple discount rules put into a single class.
- Using if/else statements would force us to always modify the existing code to just to add a new discount pricing strategy.
- The discount strategies can become difficult and time consuming to read and follow as the number of if/else conditions grows. 
- Without using if/else statements, the order class can use whatever discount strategy of my choosing without it having to know of its implementation 