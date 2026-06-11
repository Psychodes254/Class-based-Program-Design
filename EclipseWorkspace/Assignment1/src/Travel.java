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
  
}

// to represent Inn housing
class Inn implements IHousing {
  
}

// to represent Castle housing
class Castle implements IHousing {
  
}

//to represent Transportation
interface ITransportation { }

// to represent Horse transportation
class Horse implements ITransportation {
  
}

// to represent Carriage transportation
class Carriage implements ITransportation {
  
}

// examples and tests for the class hierarchy that represents 
// Housing and Transportation trees
class ExamplesTravel {
  
}





