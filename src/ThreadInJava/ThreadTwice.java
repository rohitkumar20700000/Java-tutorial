package ThreadInJava;


public class ThreadTwice extends Thread {

    public void run() {
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ThreadTwice t1 = new ThreadTwice();
        t1.start();  // invokes run() method
        t1.start();  // throws IllegalThreadStateException

        t1.run();    // runs fine but does not start as a separate stack
    }
}

