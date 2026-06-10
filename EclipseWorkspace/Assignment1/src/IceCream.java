import tester.*;

/*
                      +------------+
                     | IceCream   |
                     +------------+
                     +------------+
                           |
                          / \
                          ---
                           |
              -------------------------
              |                       |
      +----------------+     +-------------------+
      | EmptyServing   |     | Scooped           |
      +----------------+     +-------------------+
      | boolean cone   |     | IceCream more     |
      +----------------+     | String flavor     |
                             +-------------------+
*/

// to represent IceCream
interface IceCream { }

// to represent EmptyServing
class EmptyServing implements IceCream {
  boolean cone;
  
  // the constructor
  EmptyServing(boolean cone) { 
    this.cone = cone;
  }
}

// to represent Scooped
class Scooped implements IceCream {
  IceCream more;
  String flavor;
  
  // the constructor
  Scooped(IceCream more, String flavor) {
    this.more = more;
    this.flavor = flavor;
  }
}

// examples for  the classes that represent IceCream
class ExamplesIceCream {
  IceCream order1 = new Scooped(
      new Scooped(
          new Scooped(
              new Scooped(
                  new EmptyServing(false), 
                  "mint chip"),
              "coffee"), 
          "black raspberry"), 
      "caramel swirl");
  
  IceCream order2 = new Scooped(
      new Scooped(
          new Scooped(
              new EmptyServing(false),
              "chocolate"),
          "vanilla"),
      "strawberry");
}