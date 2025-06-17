
package Opps;
class Shape{
	public void display(){
		System.out.println("Inside display");
		
	}
}
class Rectangle extends Shape{
	public void area(){
		System.out.println("Inside area");
	}
}
class Cube extends Shape{
	public void Volume() {
		System.out.println("Inside Volume");
		
	}
}
public class MultilevelExample {

	public static void main(String[] args) {
		Cube obj=new Cube();
		obj.display();
		// TODO Auto-generated method stub

	}

}



//In multi level inheritence,a sub class extends from the super class ,same sub class acts as a super class for another class

//Multiple inheritance allows a class to inherit attributes and methods from more than 1 parent class.
//Multiple inheritance,Allows a class to inherit attributes to method from more than 1 parent class. So, 
//it leads to ambiguity and complexity, results in diamond problem.so, it doesn't exist in java for security bases
//in multi level inheritaence , a derived class inheriting a base class as well as derived acts as a base class for other class