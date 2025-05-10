package DSA;

import java.util.Scanner;

public class TwoDimenArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[][] = new int[100][100];
        int i, j;

        System.out.print("Enter the row: ");
        int row = scan.nextInt();

        System.out.print("Enter the col: ");
        int col = scan.nextInt();

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.printf("Enter element at [%d][%d]: ", i, j);
                a[i][j] = scan.nextInt();
            }
        }

        System.out.println("\nThe 2D array is:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
    }
}
