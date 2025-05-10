package Basics;
@FunctionalInterface
interface a{
	public void cal();
}
public class Hello implements a{

	public void cal() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Hello obj=new Hello();            
		obj.cal();
	}

}
//oops are fundamental principle that organize software design around object, which combine data and behaviour.


////class serves a blueprint for creating a object, it defines the structure and functionality that object of class will process
//class logical entity
//eg:dog is a class that define name, read and age.And action(method):bark,eat etc

//Object is a real time entity of a class ,represents its own :state and action,charactetics and behaviour
//object is a physical entity
//
//encapsulation bundles data and method within a single unit
//it involves hiding the internal state of the object,outside access by declaring attribute as private and providing public ,getter and setter method 
//to access an modifier then
//eg:an bank acc encapsulate an data, provides method that interept with each other