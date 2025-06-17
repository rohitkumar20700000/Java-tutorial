package Basics;

public class StaticMethodExample {
	static int num =10;//static variable
	static String str="welcome to sis";//static variable
	int a=2;
	
	//static method
	static void Mymethod() {
		System.out.println("Static number is: "+num);
		
		System.out.println("Hai I am method"+str);
		
	}
	//non-static method
	void nonstatic() {
		System.out.println(num);
		System.out.println(a);
		
		Mymethod();//static method can accessed by non-static method also
		
	}

	public static void main(String[] args) {
		StaticMethodExample obj = new StaticMethodExample();
		obj.nonstatic();
		Mymethod();
		
		// TODO Auto-generated method stub

	}

}
//static method is create method belongs to class rather than any specific instance of the class 
//note: static method can access static variable directly without the need of object,
//static method can be accessed directly in both static and non-static context,
//jvm executes the static method first even before creating class objects

//Method vs function:
//	method are similar to function ,but it can be used inside the class and do's same functionality
//	function are used outside or without class method,it involves specific functionality



//types of variable: 
//	1.instance variable
//	2.local variable
//	3.static variable
//	
//instance variable are known as non-static variable and are declared in a class outside of any method constructor or block
//instance variable are created when the object of the class is created and destroyed when the object is destroyed.
//using constructor ,we can initialize the instance variable and instance variable also accessed by creating object.
//
//
//local variable: a variable define within the block or method or constructor is called local variable