package Basics;
class Helper {
    // Static method
    public static void showMessage() {
        System.out.println("Hello from the Helper class!");
    }
}

public class StaticCallFromAnotherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Calling static method from another class in same package
        Helper.showMessage(); // ✅ No object needed
	}

}
//A simple example with two classes in the same package showing how to call a static method from one class in another, 
//without creating an object.

//✅ Key Notes:
//Both classes are in the same Opps package.
//
//The static method showMessage() is called directly using the class name Helper.
//
//No object is created.