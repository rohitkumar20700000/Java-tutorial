package ProblemSolving;

public class FactorialOfNumbers {

    public static void main(String[] args) {
        getFactorial(4);
        int result = getrecFactorial(4);
        System.out.println("Factorial is " + result);

    }

    public static void getFactorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        System.out.println("factorial is " + fac);
    }
//    recursive factorial-Non-tail
    public static int getrecFactorial(int n) {
        // base case
        if (n == 1) {
            return 1; // 5*4*3*2*1
        }
        // recursive case
        else {
//        	another implementation n*recursive so non-tail
            return n * getrecFactorial(n - 1); // e.g., 5 * getFactorial(4)
        }
    }
//    tail recursion
    public static void displayNums(int n) {
        if (n == 1) {
            System.out.println(n);
        } else {
            System.out.println(n);
            displayNums(n - 1);
        }
    }

    
}

//Recursive Functions
//
////A recursive function is a function that calls itself directly or indirectly to solve a problem by breaking it down into smaller instances of the same problem. 
////This technique is commonly used in programming to solve problems that can be divided into simpler, similar subproblems.
//
//Types of recursive function:
//	1.tail-recursive call is the last statement to be executed
//	2.non-tail-there are more implementations /statements to be executed after recursive call
//
//Key Principles
//
//Base Case and Recursive Case
//
//Every recursive function must have a base case and a recursive case. The base case is the simplest scenario that does not require further recursion and prevents 
//the function from calling itself indefinitely. The recursive case is where the fun
