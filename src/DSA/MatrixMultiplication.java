package DSA;

public class MatrixMultiplication {

    public static void main(String[] args) {
        // Matrix A (2x3)
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Matrix B (3x2)
        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Result matrix (2x2)
        int[][] result = new int[2][2];

        // Matrix multiplication logic
        for (int i = 0; i < A.length; i++) { // rows of A
            for (int j = 0; j < B[0].length; j++) { // columns of B
                for (int k = 0; k < B.length; k++) { // columns of A / rows of B
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print the result
        System.out.println("Product of Matrix A and B:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); // <- This line had invalid characters, now corrected
        }
    }
}
