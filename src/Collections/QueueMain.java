package Collections;
import java.util.LinkedList;
import java.util.Queue;


public class QueueMain {

	public static void main(String[] args) {
	      // Create a queue using LinkedList
        Queue<Integer> q = new LinkedList<>();

        // Adding items to the queue
        q.add(10);
        q.add(20);
        q.add(15);
        q.add(25);
        q.add(35);
        q.add(45);

        // Printing the top element of the queue
        System.out.println("Peek element: " + q.peek());
        
        System.out.println("Offer of 1st Element"+q.offer(1));// true or false

        // Printing the top element and removing it
//        from the linkedList container
        System.out.println("Queue elements:"+q.poll());
        System.out.println(q);
        
//        printing the top element
        System.out.println(q.peek());


	}

}
//queue interface is a Data structure,it follow firsts in first out where the first element is added it is the first one to be removed,
//It is ordered collection suitable for managing task or data in a sequence there arrived
