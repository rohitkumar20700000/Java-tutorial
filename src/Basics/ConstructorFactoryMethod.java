package Basics;
//Singleton Design Pattern
// To avoid private field constructor ,there must be
//    a singleton Design Pattern to ensure only one
//    instance of a class exists throughout the application

//2.Global access point to get the instance of a class
public class ConstructorFactoryMethod {
	private String name,department;
	private int age;
	private ConstructorFactoryMethod(String name,int age,String department) {
		this.name=name;
		this.age=age;
		this.department=department;
	}
//	design pattern that helps to create obj without specifing their exact classes
//	factory method is used to defines a method to create a obj instead of calling constructor
	
	public static ConstructorFactoryMethod createFactoryMethod(String name,int age,String department) {
		return new ConstructorFactoryMethod(name,age,department);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorFactoryMethod cf1=ConstructorFactoryMethod.createFactoryMethod("Syed",23,"IT");
		ConstructorFactoryMethod cf2=ConstructorFactoryMethod.createFactoryMethod("kisha", 24, "ECE");
		
		System.out.println("name"+""+cf1.name+" "+"age"+""+cf1.age+" "+"Department"+""+cf1.department);
		System.out.println("name"+""+cf2.name+" "+"age"+""+cf2.age+" "+"Department"+""+cf2.department);

	}

}
