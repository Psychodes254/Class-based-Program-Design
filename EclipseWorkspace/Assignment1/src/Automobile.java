import tester.*;

/*
+--------------------------------------+
| Automobile                           | 
+--------------------------------------+
| String model                         |
| int price [in dollars]               |
| double mileage [in miles per gallon] |
| String state                         | 
| boolean used                         |
+--------------------------------------+  
 */

// to represent an Automobile
class Automobile {
  String model;
  int price;
  double mileage;
  String state;
  boolean used;
  
  // the constructor
  Automobile(String model, int price, double mileage, String state, boolean used) {
    this.model = model;
    this.price = price;
    this.mileage = mileage;
    this.state = state;
    this.used = used;
  }
}

//examples for the class that represents an Automobile
class ExamplesAutomobile {
  Automobile toyota = new Automobile("Toyota", 12000, 54.0, "Excellent", true);
  Automobile ford = new Automobile("Ford", 45000, 19.5, "Good", true);
  Automobile honda = new Automobile("Honda", 22000, 36.9, "New", false);
  Automobile hyundai = new Automobile("Hyundai", 3500, 28.0, "Fair", true);
  Automobile chevrolet = new Automobile("Chevrolet", 1500, 31.2, "Salvage", false);
}