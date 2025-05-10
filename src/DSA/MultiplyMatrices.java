package DSA;

public class MultiplyMatrices {
    public static void main(String[] args) {
        int r1 = 2, c1 = 3;
        int r2 = 3, c2 = 2;

        // c1 should be equal to r2 for matrix multiplication
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        int[][] firstMatrix = {
            {3, -2, 5},
            {3, 0, 4}
        };

        int[][] secondMatrix = {
            {3, 1},
            {3, 2},
            {0, 4}
        };

        int[][] product = new int[r1][c2];

        // Matrix multiplication
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        // Printing the result
        System.out.println("Multiplication of 2 matrices is:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
