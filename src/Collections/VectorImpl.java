package Collections;
import java.util.Vector;


public class VectorImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vector<Integer> v1 = new Vector<Integer>();
        v1.add(12);
        v1.add(23);
        v1.add(25);

        // Iterating over vector elements using for loop
        for (int i = 0; i < v1.size(); i++) {
            // Printing elements one by one
            System.out.print(v1.get(i) + " ");
        }

        System.out.println("\nThe vector implementation: " + v1);

        // Using set() method to replace 12 with 21
        System.out.println("Object is replaced: " + v1.set(0, 21));

        // Using set() method to replace 25 with 40
        System.out.println("Object is replaced: " + v1.set(2, 40));
        
        System.out.println("\nThe vector after replacement: " + v1);

	}

}
//Vector class is a grow able array of object, that allows us to implement dynamic array, threat set implementation, it can be accessed using a Integer index
//The Vector class is a growable array of objects that allows us to implement a dynamic array. It is thread-safe and can be accessed using an integer index.
//Advan:
//You can resize the array that is set during construction, and also prevents data collection, it is slow than array list because it is Un synchronizated

//
//Task:
//	1.Write a program to append a specified element to end of hashset
//2. write the program to test if the hashset is empty or not
//3.program to get 1 st and last element in set
//4.program to compare two or three set