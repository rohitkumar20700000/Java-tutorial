package ProblemSolving;

public class ReverseArray {

    public static void main(String args[]) {
        int a[] = {5, 4, 2, 3, 8};
        int n = a.length;
        reverseArray(a, n);

        // Optional: print reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void reverseArray(int a[], int n) {
        int p1 = 0;
        int p2 = n - 1;

        while (p1 < p2) {
            int temp = a[p1];
            a[p1] = a[p2];
            a[p2] = temp;
            p1++;
            p2--;
        }
    }
}