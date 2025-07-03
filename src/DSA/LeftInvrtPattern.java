package DSA;

import java.util.Scanner;

public class LeftInvrtPattern {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scn.nextInt();

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scn.close();
    }
}
