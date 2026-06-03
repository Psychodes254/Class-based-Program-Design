import tester.*;

//to represent a Person
class Person {
  String name;
  int age;
  String gender;

  //the constructor
  Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
}

//examples and tests for Person
class ExamplesPerson {
  Person tim = new Person("Tim", 23, "Male");
  Person kate = new Person("Kate", 22, "Female");
  Person rebecca = new Person("Rebecca", 31, "Non-binary");
}