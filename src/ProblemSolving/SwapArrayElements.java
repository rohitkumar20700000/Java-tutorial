package ProblemSolving;
import java.util.Arrays;

public class SwapArrayElements {

    public static void bubbleSort(int[] a) {
        int n = a.length;
        boolean swapped;

        // Outer loop for number of passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for pairwise comparisons
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap adjacent elements if out of order
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    swapped = true;
                }
            }

            // If no swaps occurred, the array is already sorted
            if (!swapped) {
                break;
            }
        }

        // Print the sorted array
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2};
        bubbleSort(array);
    }

}
