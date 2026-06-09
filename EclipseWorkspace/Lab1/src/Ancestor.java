import tester.*;

// to represent Ancestor Interface
interface IAt { }

/*
         +-----+
         | IAt |
         +-----+
         +-----+
            |
           / \
           ---
            |
     ----------------
     |              |
+---------+    +---------+ 
| Unknown |    | Person  | 
+---------+    +---------+
|         |    | IAt Dad |
|         |    | IAt Mom |
|         |    |         |
+---------+    +---------+  
*/

// to represent Unknown
class Unknown implements IAt {
  Unknown() { }
}

// to represent Person
class Persons implements IAt {
  String name;
  IAt dad;
  IAt mom;
  
  // the constructor 
  Persons(String name, IAt dad, IAt mom) {
    this.name = name;
    this.dad = dad;
    this.mom = mom;
  }
}

// to represent examples of IAt
class ExamplesAncesor {
  ExamplesAncesor() { }
  
  IAt unknown = new Unknown();
  IAt rose = new Persons("Rose", this.unknown, this.unknown);
  IAt tom = new Persons("Tom", this.unknown, this.unknown);
  
  IAt jus =  new Persons("Jus", this.tom, this.rose);
  IAt lyn = new Persons("Lynn", this.tom, this.rose);
}