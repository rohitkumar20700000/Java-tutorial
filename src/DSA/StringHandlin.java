package DSA;
import java.util.Arrays;


public class StringHandlin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        .length() is used to find length of string		
		String type="hello";
		System.out.println("MyString is"+type);
		int length1=type.length();
		System.out.println("MyString length is"+length1);
//      concat and "+" is used to add two strings
		
		
		String str1="hai";
		String str2="hai2";
		System.out.println(str1+str2);
		String JoinedString=str1.concat(str2);
		System.out.println("Concated String is"+JoinedString);
			
		
		
		//equals check both the strings are equal or not
		boolean result1 = str1.equals(str2);
		System.out.println("String are not equal");

		//indexOf returns the occurrences of the string
		String str5 = "hai i am string string using new";
		int result3 = str5.indexOf("string");
		int result4 = str5.indexOf("i", 0);

		System.out.println("Using indexOf() " + result3);
		System.out.println("Using indexOf() " + result4);

		String text1 = "java is a programming language";
		//Split string from space
		
		//limit = no of resulting substrings

		String vowels = "a:b:c:d:e";
		//Splitting the string
		//Storing the result in an array
		String[] resultvowel = vowels.split(":");

		//Converting array to string and printing it
		System.out.println("result = " + Arrays.toString(resultvowel));

		//Replace the text or char with the given text
		String str34 = "hai bat and ball";
		System.out.println(str34.replace("b", "*"));
		System.out.println(str34.replace("bat", "catch"));

		String substringresult = "Welcome to Java World   ";
		System.out.println(substringresult.substring(4, 6));
		System.out.println(substringresult.trim());
		System.out.println(substringresult.charAt(5));

		//4th character to the last character
		System.out.println(substringresult.substring(4));

	}
	

}
//A string is a collection of characters, and is pre-defined class used to create string objects. note:it is immutable object, which means cannot be updated once created


//"index of" is used to find the index of the first occurrence of the specified character of substring within a string.

//To find the number of occurrence of the character or substring in a string using split method,using split you can split the string based on the target character or 
//substring and count the result

//replace method searches the string for a specified character and returns a new string where the specified characters are replaced

//substring method extracts a character from start to end,this method is most useful when you deal with text manipulation passing or data extraction
//
//trim is used to remove leading and trailing spaces,it accept parameter.

//task:
//	1.Write a program to get the index of all character of the alphabet
//  2.write the program to concatenate the given string to the end of another string

