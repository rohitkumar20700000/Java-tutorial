package Opps;

public class methodWithParameterOrWithout {
	public void display() {
		System.out.println("I love cars");
	}
	public void speed(int maxSpeed) {
		System.out.println("My max speed is"+maxSpeed);
	}

	public static void main(String[] args) {
		methodWithParameterOrWithout obj =new methodWithParameterOrWithout();
	    obj.display();
	    obj.speed(25);
		
		// TODO Auto-generated method stub

	}

}

//methods are declared within the class, used to perform certain class
