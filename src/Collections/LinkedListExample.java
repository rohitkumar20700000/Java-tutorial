package Collections;
import java.util.LinkedList;


public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        cars.addFirst("Mazda");
        cars.addLast("Audi");
        System.out.println(cars);

        // Use removeFirst() to remove the first item from the list
         cars.removeFirst();
        // System.out.println(cars);

        cars.removeLast();
        // System.out.println(cars);

        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());      
        boolean containsVolvo = cars.contains("Volvo");
        System.out.println(containsVolvo);

        boolean isEmpty = cars.isEmpty();
        System.out.println(isEmpty);

        cars.clear();
        System.out.println(cars);

        


	}

}
//LinkedList:
//It is linear data structures where elements are  stored in nodes.
//each node contain data and reference to the next node in the sequence.
//Unlike Arrays ,linkedList do not store elements in continuous memory location
//it allows for efficient insertion and deletion at any position in the list
//
//types of linkedList:	
//singly  linkedList
//doubly  linkedList
//circular linkedList

//Task:
//	1.write the java program to increase a arrayList size
//	2.write a java program to join two array list
//	3.java program to empty a array list
//    4.java program to print the array list using element position
//  5. java program to swap two element in arrayList
//  6. java program to replace the second element of the arratList with a specified element
