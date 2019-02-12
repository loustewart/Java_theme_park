# Theme Park - Homework Revising Abstract Classes, Interfaces and Polymorphism.

### Learning Objectives

Practice modelling a large real world domain and what you have learned about using:

* classes
* inheritance
* abstract classes
* interfaces

## ThemePark

### MVP - Classes and Abstract Classes

Model a ThemePark.ThemePark (with various Attractions.Attraction and Stalls) and its Visitors.

Remember to model class diagrams first, then write tests, then write code.

1. `ThemePark.ThemePark.Visitor` has age, height, money
2. Using a `Attractions.Attraction` abstract class (which has a `name`), create some subclasses for `Attractions.Rollercoaster`, `Attractions.Dodgems`, `Attractions.Park`, `Attractions.Playground`
3. Using a `Stall` abstract class (which has a `name`, `ownerName` and `parkingSpot`), create some classes for `IceCreamStall`, `CandyFlossStall`, `TobaccoStall`

### Extension - Classes and Abstract Classes

4. `ThemePark.ThemePark` stores all `Attractions` and `Stalls` in it.
5. `ThemePark.ThemePark` has a method `visit(ThemePark.ThemePark.Visitor, Attractions.Attraction)`

### MVP - Interfaces 

Introduce some Interfaces to enable charging, restricting and reviewing attractions and stalls: 
	
1. `ITicketed` promises `double defaultPrice()` and `double priceFor(ThemePark.ThemePark.Visitor)`
2. `ISecurity` promises `boolean isAllowedTo(ThemePark.ThemePark.Visitor)`
3. `IReviewed` promises `int getRating()` and `String getName()`

	Have some of the classes implement these interfaces. Below are the rules about what the implementations should be:

4. `Attractions.Playground` implements `ISecurity` because it has a maximum age of 15
5. `TobaccoStall` implements `ISecurity` because it has a minimum age of 18
6. `Rollercoster` implements `ISecurity` and requires a visitor to be over 145cm tall and over 12 years of age

### Extension - Interfaces

> Note: Starting prices are: £8.40 `Attractions.Rollercoaster`, £4.50 `Attractions.Dodgems`, £2.80 `IceCreamStall`, £4.20 `CandyFlossStall`, £6.60 `TobaccoStall`

7. `Attractions.Rollercoaster` implement `ITicketed` and charges tall people over 200cm double fee
8. `Attractions.Dodgems` implement `ITicketed` and charge half price to children under 12 years old
9. All `Stall`s implement `ITicketed` but they use a starting price whoever is buying
10. `Attractions.Park` and `Attractions.Playground` have no ticketing gate so do not implement `ITicketed` for these, but all other `Attractions.Attraction`s do.
	
### MVP - Polymorphism 
	
1. All `Attractions.Attraction`s and `Stall`s have a class variable `int rating`
2. All `Attractions.Attraction`s and `Stall`s implement `IReviewed` and implement a getter for `int getRating()` and `String getName()`
3. `ThemePark.ThemePark` has a method `getAllReviewed()` which returns an ArrayList of `IReviewed`


### Extension - Polymorphism 

4. `ThemePark.ThemePark` has a method `getAllAllowedFor(ThemePark.ThemePark.Visitor)` which takes a `ThemePark.ThemePark.Visitor` and returns an ArrayList of `ITicketed`
6. `ThemePark.ThemePark` has a method that can return a string with all reviews, returning a String a little bit like this: `Rollercoster: 4, Attractions.Dodgems: 8, Attractions.Park: 2, Stalls.IceCream: 6, TobaccoStall: 1 `	