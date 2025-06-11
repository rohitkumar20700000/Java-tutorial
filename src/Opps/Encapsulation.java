

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

//how encapsulation is implemented :
//	implemeneting the data or member variable in private access modifier .
//getter and setter method is used to provide the functionality and implementation of method is written from the user

//get->fetch or aceess the data
//set->modify the data


//hw
//1.write a program to create class bank account with private instance variable ,acc number and balance.
//provide public setter and gett0+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++er to access and modify these variables.