package Opps;
//polymorphism-many forms,
//allows obj of different class to be treated in a similar way,
//Eventhrough that may have different implementation.
//two ways to achieve polymorphish-1.methodoverloading,methodoverwriting

//Parent class
class Animal {
 // Method to be overridden
 void sound() {
     System.out.println("Animal makes a sound");
 }
}

//Subclass 1
class Tiger extends Animal {
 @Override
 void sound() {
     System.out.println("tiger barks");
 }
}

//Subclass 2
class Cat extends Animal {
 @Override
 void sound() {
     System.out.println("Cat meows");
 }
}

//Class for method overloading
class Calculator {
 // Overloaded add method (2 int parameters)
 int add(int a, int b) {
     return a + b;
 }

 // Overloaded add method (3 int parameters)
 int add(int a, int b, int c) {
     return a + b + c;
 }

 // Overloaded add method (double parameters)
 double add(double a, double b) {
     return a + b;
 }
}

public class Polymorphism {

 public static void main(String[] args) {
     // Compile-time polymorphism (Method Overloading)
     Calculator calc = new Calculator();
     System.out.println("Addition of 2 int: " + calc.add(5, 10));
     System.out.println("Addition of 3 int: " + calc.add(5, 10, 15));
     System.out.println("Addition of 2 double: " + calc.add(5.5, 4.5));

     // Run-time polymorphism (Method Overriding)
     Animal myAnimal;

     myAnimal = new Tiger();  // Dog object
     myAnimal.sound();      // Output: Dog barks

     myAnimal = new Cat();  // Cat object
     myAnimal.sound();      // Output: Cat meows
 }
}