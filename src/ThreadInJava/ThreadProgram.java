package ThreadInJava;


class ThreadProgram extends Thread {
    public void run() {
        System.out.println("The code is running inside in the thread");
    }

    public static void main(String args[]) {
        ThreadProgram tp = new ThreadProgram();
        tp.start(); // start thread
        System.out.println("The code is running outside the thread");
    }
}


	//life cycle of thread
	//1. new (constructing) -- starting the thread by initializing the obj in the class-----init()
	//2. Runnable (prepared to execute the code in interface)--------start(), stop(), service
	//3. Running (thread for execution with/without time slot)-----run()
	//  4. Blocked (in active)
	//  5. Dead/terminated (thread exit at the run() process)
//	                                          ------destroy(), sleep(), wait()
	
	//Thread -- process
	//init()-- start(), stop(), service--run()-- destroy(), sleep(), wait()
	//notify(), notifyAll()
	//Thread--task(timebound)---sleep(ms), wait(), await()

	//how thread is implemented
	//1. extends Thread (class)
	//2. implements Runnable (interface)



	// thread priorities (based on the scenario)
	// 1 - lowest (Thread.MIN_PRIORITY)
	// 5 - standard (Thread.NORM_PRIORITY)
	// 10 - highest ((Thread.MAX_PRIORITY))



//thread is a light weight unit of a execution within a program.
//multi-threading is a process of creating and managing multiple thread within a program,to enable concurrent execution
//eg:printing a file in a concurrent execution



