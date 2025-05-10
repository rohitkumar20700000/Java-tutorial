package Opps;
class Animalnew{
	String name;
	public void eat() {
		System.out.println("I can eat");
	}
}
class Dog extends Animalnew{
	public void display() {
		System.out.println("My name is "+name);
	}
}
public class inheritance {

	public static void main(String[] args) {
		Dog obj =new Dog();
	    obj.name="vavaal";
	    obj.display();
	    obj.eat();
		// TODO Auto-generated method stub

	}

}

//Inheritance:
//   Allows new class to inherit properties, behaviors (filed, method) from existing class
//is a relatonship
//is a relationship between two classes
//eg:car is vechicle

//types:
//	single
//	multi level
//	heirarchical
//	hybrid														

//class from which sub class is derived from is called super class or base class or parent class

//the derived class is a class that is constructed from the base class that has a tendency to acquire all the method and properties of a base class
//it is also known as sub class or child class

//
//                                  super class
//                                      |
//                                      |
//                                      |
//                                      |inherits
//                                      |
//                                      |
//                                   child class
                                      
	