package ProblemSolving;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=10;
		for (int i = 0; i < N; i++) {
		    System.out.print(getFibo(i));
		}
        Fibonacci(N);


	}
//	recursive method-nontail
	public static int getFibo(int n) {
	    if (n <= 1) {
	        return n;
	    } else {
//	    	non-tail because + operation with another recursive
	        return getFibo(n - 1) + getFibo(n - 2);
	    }
	}
//	non-recursive method
	public static void Fibonacci(int N)
    {
        int n1 = 0, n2 = 1;

        for (int i = 0; i < N; i++) {
            // Print the number
            System.out.print(n1 + " ");

            // Swap
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
    }


}
