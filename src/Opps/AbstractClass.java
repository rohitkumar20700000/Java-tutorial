
package Opps;

abstract class Details
{
	abstract void printInfo();
}
class Employee extends Details
{
	void printInfo()
	{
		String name="Syed";
		int age=21;
		float salary=35500.65f;
		
		System.out.println("the name is "+name);
		System.out.println("the age is "+age);
		System.out.println("the salary is "+salary);
	}
}

	  //abstract class obj=new class()

public class AbstractClass {

	public static void main(String[] args) {
		  Details obj = new Employee();
		  obj.printInfo();
		  
		  
		// TODO Auto-generated method stub

	}

}
