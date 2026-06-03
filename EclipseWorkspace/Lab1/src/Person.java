import tester.*;

//to represent a Person
class Person {
  String name;
  int age;
  String gender;
  Address address;

  //the constructor
  Person(String name, int age, String gender, Address address) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.address = address;
  }
}

// to represent Address
class Address {
  String city;
  String state;
  
  // the constructor 
  Address(String city, String state) {
    this.city = city;
    this.state = state;
  }
}

// examples and tests for Person
class ExamplesPerson {
  Address atim = new Address("Boston", "MA");
  Address akate = new Address("Warwick", "RI");
  Address arebecca = new Address("Nashua", "NH");
  Address amash = new Address("Busia", "NM");
  Address ajustus = new Address("Machakos", "AR");
  
  Person tim = new Person("Tim", 23, "Male", atim);
  Person kate = new Person("Kate", 22, "Female", akate);
  Person rebecca = new Person("Rebecca", 31, "Non-binary", arebecca);
  Person mash = new Person("Mash", 25, "Male", amash);
  Person justus = new Person("Justus", 28, "Male", ajustus);
}