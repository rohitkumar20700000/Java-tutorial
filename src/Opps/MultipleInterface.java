package Opps;

interface FirstInterface{
	public void myMethod();
	
}
interface SecondInterface{
	public void myOtherMethod();
}
class DemoClass implements FirstInterface,SecondInterface{
	public void myMethod() {
		System.out.println("Some text...");
	}
	public void myOtherMethod() {
		System.out.println("Some other text...");
	}
}

public class MultipleInterface {

	public static void main(String[] args) {
		DemoClass obj=new DemoClass();
		obj.myMethod();
		obj.myOtherMethod();
				
		
		// TODO Auto-generated method stub

	}

}
