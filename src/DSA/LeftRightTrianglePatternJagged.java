package DSA;

public class LeftRightTrianglePatternJagged {

    public static void main(String[] args) {
        int row = 5;

        // Creating jagged array
        char[][] stars = new char[row][];
        for (int i = 0; i < row; i++) {
            stars[i] = new char[i + 1]; // only initialize the size
        }

        // Print and fill during output
        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                System.out.print("*");
            }
            System.out.println(); // <-- This line had hidden characters; now cleaned
        }
    }
}