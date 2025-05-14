package ProblemSolving;

public class SearchElementInArray {

    public static void main(String args[]) {
        int a[] = {1,2,3,4,5,6,7};
        System.out.println(linearSearch(a, 9)); // corrected method call
        System.out.println(binarySearch(a, 6));
    }

    // linear search
    public static int linearSearch(int a[], int elem) {
        for (int i = 0; i < a.length; i++) {
            if (elem == a[i]) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int a[], int elem) {
        int l = 0;
        int r = a.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (a[mid] == elem) {
                return mid;
            } else if (elem > a[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return -1; // Element not found
    }

}
