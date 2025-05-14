package ExceptionHandling;

public class ExceptionHand {
    public static void main(String[] args) {
        try {
            // Fully qualified class name: "ProblemSolving.ReverseArray"
            Class.forName("ProblemSolving.ReverseArray");
            System.out.println("Class is found");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e);
            System.out.println("Class Not Found");
        }
    }
}
//exception handling(error,bug,exception)
//exception handling is a mechanism to manage runtime error

//types of exception:
//	1.checked exception-must be handled or declared
//	2.unchecked exception-don't need explicit handling

//  try--encloses a code that may throw a exception
//	
//	catches-- an handle a specific type of exception
//	
//	finally--contains code that executes regardless of whether a exception is thrown
//	
//	throw--explicitly throws an exception

//  throws--declares the method might throw an exception