package DSA;
import java.util.Scanner;

public class StarPatternLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {               // Outer loop for rows
            for (int j = 1; j <= i; j++) {           // Inner loop for stars
                System.out.print("* ");
            }
            System.out.println();                    // Move to next line
        }

        sc.close();
    }
}
