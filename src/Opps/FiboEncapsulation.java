package Opps;

import java.util.Scanner;

//Class using encapsulation
class Fibonacci {
 private int count; // private variable

 // Setter method
 public void setCount(int count) {
     this.count = count;
 }

 // Getter method
 public int getCount() {
     return count;
 }

 // Method to print Fibonacci series
 public void printSeries() {
     int a = 0, b = 1;
     for (int i = 0; i < count; i++) {
         System.out.println(a);
         int c = a + b;
         a = b;
         b = c;
     }
 }
}

public class FiboEncapsulation {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     Fibonacci fib = new Fibonacci();
     int n = scanner.nextInt();

     // Set the value using setter (encapsulation)
     fib.setCount(n);

     // Print the series
     fib.printSeries();
     

     scanner.close();
 }
}

