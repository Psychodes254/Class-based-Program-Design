import tester.*;

/*
+------------------------+
| Dog                    | 
+------------------------+
| String name            |
| String breed           |
| int yob                |
| String state           | 
| boolean hypoallergenic |
+------------------------+  
*/

// to represent a Dog
class Dog {
  String name;
  String breed;
  int yob;
  String state;
  boolean hypoallergenic;
  
  // the constructor
  Dog(String name,
      String breed, 
      int yob, 
      String state, 
      boolean hypoallergenic) {
    
    this.name = name;
    this.breed = breed;
    this.yob = yob;
    this.state = state;
    this.hypoallergenic = hypoallergenic;
  }
}

// examples for the class that represents a dog 
class ExamplesDogs {
  Dog hufflepuff = new Dog("Hufflepuff", "Wheaten Terrier", 2012, "TX", true);
  Dog pearl = new Dog("Pearl", "Labrador Retriever", 2016, "MA", false);
}