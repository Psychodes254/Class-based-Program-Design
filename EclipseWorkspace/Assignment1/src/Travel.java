import tester.*;

/*
                          +----------+                
                          | IHousing |                
                          +----------+                
                          +----------+                
                               |                     
                              / \                    
                              ---                    
                               |                     
         -----------------------------------------------           
         |                     |                       |           
+----------------+    +----------------+    +--------------------+
| Hut            |    | Inn            |    |  Castle            |
+----------------+    +----------------+    +--------------------+
| int capacity   |    | String name    |    | String name        |
| int population |    | int capacity   |    | String familyName |
|                |    | int population |    | int population     |
|                |    | int stalls     |    | int carriages      |
+----------------+    +----------------+    +--------------------+  

        +-----------------+                
        | ITransportation |                
        +-----------------+
        | IHousing from   |
        | IHousing to     |
        +-----------------+                
                 |                     
                / \                    
                ---                    
                 |                     
       ---------------------           
       |                   |           
+--------------+    +-------------+  
| Horse        |    | Carriage    |  
+--------------+    +-------------+  
| String name  |    | int tonnage |  
| String color |    |             |  
+--------------+    +-------------+ 
*/

// to represent Housing
interface IHousing { }

// to represent Hut housing 
class Hut implements IHousing {
  int capacity;
  int population;
  
  // the constructor 
  Hut(int capacity, int population) {
    this.capacity = capacity;
    this.population = population;
  }
}

// to represent Inn housing
class Inn implements IHousing {
  String name;
  int capacity;
  int population;
  int stalls;
  
  // the constructor
  Inn(String name, int capacity, int population, int stalls) {
    this.name = name;
    this.capacity = capacity;
    this.population = population;
    this.stalls = stalls;
  }
}

// to represent Castle housing
class Castle implements IHousing {
  String name;
  String familyName;
  int population;
  int carriages;
  
  // the constructor 
  Castle(String name, String familyName, int population, int carriages) {
    this.name = name;
    this.familyName = familyName;
    this.population = population;
    this.carriages = carriages;
  }
}

//to represent Transportation
interface ITransportation { }

// to represent Horse transportation
class Horse implements ITransportation {
  String name;
  String color;
  IHousing from;
  IHousing to;
  
  // the constructor
  Horse(String name, String color, IHousing from, IHousing to) {
    this.name = name;
    this.color = color;
    this.from = from;
    this.to = to;
  }
}

// to represent Carriage transportation
class Carriage implements ITransportation {
  int tonnage;
  IHousing from;
  IHousing to;
  
  // the constructor
  Carriage(int tonnage, IHousing from, IHousing to) {
    this.tonnage = tonnage;
    this.from = from;
    this.to = to;
  }
}

// examples and tests for the class hierarchy that represents 
// Housing and Transportation trees
class ExamplesTravel {
  IHousing hovel = new Hut(5, 1);
  IHousing winterfell = new Castle("Winterfell", "Stark", 500, 6);
  IHousing crossroads = new Inn("Inn At The Crossroads", 40, 20, 12);
  IHousing hovel2 = new Hut(16, 3);
  IHousing winterfell2 = new Castle("Winterfell2", "Tully", 800, 20);
  IHousing crossroads2 = new Inn("Inn At The Crossroads2", 80, 30, 28);
  
  ITransportation horse1 = new Horse("Horse1", "Brown", this.crossroads, this.hovel);
  ITransportation carriage1 = new Carriage(500, this.crossroads, this.winterfell);
  ITransportation horse2 = new Horse("Horse2", "white", this.crossroads2, this.hovel2);
  ITransportation carriage2 = new Carriage(380, this.crossroads2, this.winterfell2);
}





