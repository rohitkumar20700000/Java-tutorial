package ThreadInJava;

import java.util.*;

public class CurrentThread extends Thread {
    public void run() {
        // Optional: put some thread logic here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input thread names
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        // Create thread objects
        CurrentThread a = new CurrentThread();
        CurrentThread b = new CurrentThread();

        // Get current thread group (usually "main")
//        ThreadGroup group = Thread.currentThread().getThreadGroup();

        // Create threads with names and correct group
        Thread t1 = new Thread(a, name1);
        Thread t2 = new Thread(b, name2);

        // Set priorities
        t1.setPriority(4);
        t2.setPriority(2);

        // Start threads
        t1.start();
        t2.start();

        // Print thread details
        System.out.println(t1.currentThread());  // Thread[name1,4,main]
        System.out.println(t2.currentThread());  // Thread[name2,2,main]
    }
}
