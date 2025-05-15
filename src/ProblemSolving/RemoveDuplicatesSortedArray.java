package ProblemSolving;
import java.util.Arrays;

public class RemoveDuplicatesSortedArray {

    public static void removeDuplicates(int a[]) {
        Arrays.sort(a); // Sort first

        int p2 = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[p2]) {
                p2++;
                a[p2] = a[i];
            }
        }

        // Fill remaining elements with 0
        for (int i = p2 + 1; i < a.length; i++) {
            a[i] = 0;
        }

        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 9, 10, 9, 10};
        removeDuplicates(a);  // Output will be: [3, 4, 6, 7, 9, 10, 0, 0]
    }
}
