package Basics;
//Parent class
class Animal {
 Animal() {
     System.out.println("Animal constructor - no args");
 }

 Animal(String type) {
     System.out.println("Animal constructor - type: " + type);
 }
}

//Child class
class Dog extends Animal {
 Dog() {
     // Calls parameterized constructor of Dog
     this("Bulldog");
     System.out.println("Dog constructor - no args");
 }

 Dog(String breed) {
     // Calls parameterized constructor of Animal
     super("Dog");
     System.out.println("Dog constructor - breed: " + breed);
 }
}

//Main class
public class ConstructorChainingExample {
 public static void main(String[] args) {
     Dog dog = new Dog();  // Creates Dog object using no-arg constructor
 }
}

//
//Call one constructor from another constructor is called constructor chaining in java. 
//
//Using this() keyword ---- call the current class constructor within the “same class”.
//Using super() keyword ---- call the superclass constructor from the “base class”.
