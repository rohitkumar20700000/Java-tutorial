package Opps;
class Animal1{
	public void eat() {
		System.out.println("I can eat");
	}
}
class Dog1 extends Animal1{
	@Override
	public void eat() {
		super.eat();
		System.out.println("I eat dog food");
	}
	public void bark() {
		System.out.println("I can bark");
	}
	
}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 obj=new Dog1();
		obj.eat();
		obj.bark();

	}

}


//Super is a keyword ,used to call the method of parent class form method of the child class
//overide is used to change the method property of parent class using child class