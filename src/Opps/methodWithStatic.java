package Opps;

public class methodWithStatic {
	
	static void myMethod() {
		System.out.println("hello SLA using static");
	}
	public void myMethod1() {
		System.out.println("hello SLA using public");
	}

	public static void main(String[] args) {
		methodWithStatic  obj= new methodWithStatic ();
		obj.myMethod1();
		myMethod();
		obj.myMethod();
	    
		
		// TODO Auto-generated method stub

	}

}

//Using  public access modifier,always object is required for execution 
//where for static keyword, using object is optional 