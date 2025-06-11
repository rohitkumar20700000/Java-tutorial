package Basics;


//byte //Byte
//long //Integer
//short //Short
//double //Double
//boolean //Boolean
//float //Float 

//It is used to convert all primitives datatype into
//It corresponding wrapper objects (through class) and vice--versa

public class WrapperClassWhole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.0F;
		double d=60.0D;
		char c='a';
		boolean b2=true;
		
		//Autoboxing:Coverting primitive data type into objects
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean boolobj=b2;
		
		//Printing objects
		System.out.println("----Printing object values------");
		System.out.println("Byte object "+byteobj);
		System.out.println("Short object"+shortobj);
		System.out.println("Integer object"+intobj);
		System.out.println("Long object"+longobj);
		System.out.println("Float object"+floatobj);
		System.out.println("Double object"+doubleobj);
		System.out.println("Character object"+charobj);
		System.out.println("Boolean object"+boolobj);
		
		//unboxing :Converting objects  to primitive data types
		byte bytevalue=byteobj;
		short shortvalue=shortobj;
		int intvalue=intobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		char charvalue=charobj;
		boolean boolvalue=boolobj;
		
		//Printing primitives
		
		System.out.println("------Printing primitives values");
		System.out.println("Byte Value"+bytevalue);
		System.out.println("Short Value"+shortvalue);
		System.out.println("Integer Value"+intvalue);
		System.out.println("Long Value"+longvalue);
		System.out.println("Float Value"+floatvalue);
		System.out.println("Double Value"+doublevalue);
		System.out.println("Char Value"+charvalue);
		System.out.println("Bool Value"+boolvalue);

		
		
	}

}
