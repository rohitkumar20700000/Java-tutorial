
package Opps;

public class Encapsulation {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String newname) {
		this.name=newname;
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	}

}
//'this' is keyword,acts as a reference to the current object of the class
//'this' can be used to call another constructor in same class
//'this' can be used as the argument to another method
//'this' cannot used in static method or static block


//encapsulation:
//	bind the method and data
//In encapsulation, the variables or data of a class are hidden from any other class and can be accessed only through any member function of its own class.
//A private class can hide its members or methods from the end user, using abstraction to hide implementation details, by combining data hiding and abstraction.
//Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.
//It is more defined with the setter and getter method.

//how encapsulation is implemented :
//	implemeneting the data or member variable in private access modifier .
//getter and setter method is used to provide the functionality and implementation of method is written from the user
//get->fetch or aceess the data
//set->modify the data

//advantage of encapsulation:
//data hiding,internal data of object  is hidden,preventing direct access
//data preventy-values can be assigned via set method
//reusability-reusable for futher  modification
//security



//hw
//1.write a program to create class bank account with private instance variable ,acc number and balance.
//provide public setter and getter to access and modify these variables.
//program using encapsulation  to bind emp id,name,location.the varible can be accessed within the same class using get and set.
// write the program to create a class called bank acc with private instants variable acc number and balance provide public getter 
//and setter method to access and modify the data.