import tester.*;

// to represent menu interface
interface IMenu { }

/*
                             +----------+
                             | IMenu    |
                             +----------+
                             +----------+
                                   |
                                  / \
                                  ---
                                   |
          --------------------------------------------------
          |                        |                       |
+--------------------+    +--------------------+    +-----------------+
| Soup               |    | Salad              |    | Sandwich        |
+--------------------+    +--------------------+    +-----------------+
| String name        |    | String name        |    | String name     |
| int price          |    | int price          |    | int price       |
| boolean vegetarian |    | boolean vegetarian |    | String bread    |
|                    |    | String dressing    |    | String filling1 |
|                    |    |                    |    | String filling2 |
+--------------------+    +--------------------+    +-----------------+
*/

// to represent soup
class Soup implements IMenu {
  String name;
  int price;
  boolean vegetarian;
  
  // the constructor
  Soup(String name, int price, boolean vegetarian) {
    this.name = name;
    this.price = price;
    this.vegetarian = vegetarian;
  }
}

// to represent salad
class Salad implements IMenu {
  String name;
  int price;
  boolean vegetarian;
  String dressing;
  
  // the constructor 
  Salad(String name, int price, boolean vegetarian, String dressing) {
    this.name = name;
    this.price = price;
    this.vegetarian = vegetarian;
    this.dressing = dressing;
  }
}

// to represent sandwich
class Sandwich implements IMenu {
  String name;
  int price;
  String bread;
  String filling1;
  String filling2;
  
  // the constructor
  Sandwich(String name, int price, String bread, String filling1, String filling2) {
    this.name = name;
    this.price = price;
    this.bread = bread;
    this.filling1 = filling1;
    this.filling2 = filling2;
  }
}

// to represent examples and tests for menus
class ExamplesMenu {

  IMenu tomatoSoup =
      new Soup("Tomato Soup", 450, true);

  IMenu chickenNoodleSoup =
      new Soup("Chicken Noodle Soup", 600, false);

  IMenu caesarSalad =
      new Salad("Caesar Salad", 700, false, "Caesar Dressing");

  IMenu gardenSalad =
      new Salad("Garden Salad", 550, true, "Italian Dressing");

  IMenu pbjSandwich =
      new Sandwich("PB&J Sandwich", 500,
                   "White Bread", "Peanut Butter", "Jelly");

  IMenu hamCheeseSandwich =
      new Sandwich("Ham and Cheese Sandwich", 750,
                   "Whole Wheat Bread", "Ham", "Cheese");
}