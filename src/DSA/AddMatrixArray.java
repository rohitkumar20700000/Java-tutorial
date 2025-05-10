package DSA;

public class AddMatrixArray {
    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int b[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int c[][] = new int[3][3];  // same size as a and b

        // Adding matrices a and b and storing in c
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        // Printing the result matrix
        System.out.println("Sum of the two matrices is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            
            
            System.out.println();
        }
    }
}
//jagged array also known as ragged array,is a array of array where th einner array can a have different lengths
//jagged array provides fexibility where the size of each row may very