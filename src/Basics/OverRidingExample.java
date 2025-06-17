package Basics;

//Parent class
class Gadgets {
 void display() {
     System.out.println("I am a Gadget");
 }
}

//Child class
class Laptop extends Gadgets {
 // Overriding the display method
 @Override
 void display() {
     System.out.println("I am a Laptop");
 }

 // Method to call both overridden and superclass display methods
 void print() {
     this.display();      // Calls overridden method in Laptop
     super.display();     // Calls superclass method in Gadgets
 }
}

//Main class to test
public class OverRidingExample {
 public static void main(String[] args) {
     Laptop myLaptop = new Laptop();
     myLaptop.print();
 }
}
