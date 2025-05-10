package DSA;

import java.util.Scanner;

public class StarPatternRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // Loop for each row
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // Print spaces
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* "); // Print stars
            }
            System.out.println(); // Move to next line
        }

        sc.close();
    }
}
