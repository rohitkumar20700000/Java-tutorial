package DSA;

public class JaggedArrayDemo {
    public static void main(String[] args) {
        System.out.println("Enter the number of arrays");

        // Declaring a jagged array with 3 rows
        int[][] jag = new int[3][]; // 3 rows, columns not defined yet

        // Initializing each row with different column lengths
        jag[0] = new int[] {1, 2, 3};
        jag[1] = new int[] {4, 5};
        jag[2] = new int[] {6, 7, 8, 9};

        // Printing the jagged array
        for (int i = 0; i < jag.length; i++) { // i - row
            // based on i due to jagged array
            for (int j = 0; j < jag[i].length; j++) { // j - column
                System.out.print(jag[i][j] + " ");
            }
            System.out.println();
        }
    }
}