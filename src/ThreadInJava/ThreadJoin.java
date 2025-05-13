package ThreadInJava;

//500 milliseconds
public class ThreadJoin extends Thread {
 public void run() {
     for (int i = 1; i <= 4; i++) {
         try {
             Thread.sleep(500); // sleep for 500 milliseconds
         } catch (Exception e) {
             System.out.println(e);
         }
         System.out.println(i);
     }
 }

 public static void main(String[] args) {
     // TODO Auto-generated method stub
     ThreadJoin t1 = new ThreadJoin();
     ThreadJoin t2 = new ThreadJoin();
     ThreadJoin t3 = new ThreadJoin();

     t1.start();
     try {
         t1.join(); // t2 and t3 will wait until t1 completes
     } catch (Exception e) {
         System.out.println(e);
     }

     t2.start();
     t3.start();
 }
}
//join causes the thread wait for another thread to complete
//sleep passes a thread for a specified duration maintaining the lock
//wait passes the thread and releases the lock,recurring a notification to resume



//task:
//	1.program to create two thread to print even and odd number
//	2.sort an integer array using multiple threads
//    3.perform sum of prime numbers using threads between 1 to 20