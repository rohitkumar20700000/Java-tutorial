package ProblemSolving;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public void printUniqueThreeDigitNumbers(int[] digits) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    // Ensure all indices are different
                    if (i != j && j != k && k != i) {
                        // First digit should not be 0
                        if (digits[i] != 0) {
                            int number = 100 * digits[i] + 10 * digits[j] + digits[k];
                            uniqueNumbers.add(number);
                        }
                    }
                }
            }
        }

        // Print all unique 3-digit numbers in sorted order
        System.out.println("Unique 3-digit numbers:");
        System.out.println(uniqueNumbers);
        for (int num : uniqueNumbers) {
            System.out.println(num);
        }
    }
}

public class ThreeDigitNumbersFormationFromArray {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example input
        int[] digits = {1, 2, 3};

        sol.printUniqueThreeDigitNumbers(digits);
    }
}
