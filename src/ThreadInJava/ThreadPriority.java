package ThreadInJava;

//Thread priorities (based on the scenario)
//1 - lowest (Thread.MIN_PRIORITY)
//5 - standard (Thread.NORM_PRIORITY)
//10 - highest (Thread.MAX_PRIORITY)

public class ThreadPriority {
 public static void main(String args[]) {
     Thread Ex1 = new Thread("Demo");
     Thread Ex2 = new Thread("Demo2");

     // Set priorities (optional)
     Ex1.setPriority(Thread.MAX_PRIORITY); // Max priority
     Ex2.setPriority(Thread.MIN_PRIORITY); // Min priority

     Ex1.start();
     Ex2.start();

     System.out.println("Thread name are as follows:");
     System.out.println(Ex1.getName());
     System.out.println(Ex2.getName());
 }

 public void run() {
     // Empty run method (not executed
}
}

//Thread Priority in Java means the importance level assigned to a thread. It helps the CPU decide which thread to execute first when multiple threads are 
//in the runnable state.
//
//🔑 Key Points:
//Java assigns a priority number (1 to 10) to each thread.
//
//Threads with higher priority are more likely to be executed before lower-priority ones.
//
//However, thread priority is only a suggestion to the thread scheduler—it does not guarantee execution order.
 