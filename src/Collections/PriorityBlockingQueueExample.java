package Collections;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueExample {
	public static void main(String[] args) throws InterruptedException {
	    PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<>();

	    pbq.put(3);
	    pbq.put(1);
	    pbq.put(2);

	    System.out.println(pbq.take());
	    System.out.println(pbq.take());
	    System.out.println(pbq.take());

	    pbq.add(10);
	    pbq.add(20);
	    pbq.add(15);
	    pbq.add(25);
	    pbq.add(5);

	    while (!pbq.isEmpty()) {
	        System.out.println(pbq.take());
	    }
	}
}

//priorityBlockingQueue is  a class that supports operation for blocking threads such as take method and put method which are not available in priority queue 
//which is thread safe and support concurrent element are added by priority but not on insertion order
