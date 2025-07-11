package ProblemSolving;

import java.util.HashMap;

//12283. Check if Number Has Equal Digit Count and Digit Value

//.You are given a 0-indexed string num of length n consisting of digits.
//
//Return true if for every index i in the range 0 <= i < n, the digit i occurs num[i] times in num, otherwise return false.
//
// 
//
//Example 1:
//
//Input: num = "1210"
//Output: true
//Explanation:
//num[0] = '1'. The digit 0 occurs once in num.
//num[1] = '2'. The digit 1 occurs twice in num.
//num[2] = '1'. The digit 2 occurs once in num.
//num[3] = '0'. The digit 3 occurs zero times in num.
//The condition holds true for every index in "1210", so return true.
//Example 2:
//
//Input: num = "030"
//Output: false
//Explanation:
//num[0] = '0'. The digit 0 should occur zero times, but actually occurs twice in num.
//num[1] = '3'. The digit 1 should occur three times, but actually occurs zero times in num.
//num[2] = '0'. The digit 2 occurs zero times in num.
//The indices 0 and 1 both violate the condition, so return false.

public class DigitCounter {

    public static boolean digitCount(String num) {
        HashMap<Integer, Integer> hs = new HashMap<>();

        // Count the frequency of each digit in the string
        for (char c : num.toCharArray()) {
            int digit = c - '0';
            hs.put(digit, hs.getOrDefault(digit, 0) + 1);
        }

        // Check if digit i appears num.charAt(i) times
        for (int i = 0; i < num.length(); i++) {
            int expected = num.charAt(i) - '0'; // expected count
            int actual = hs.getOrDefault(i, 0); // actual count of digit 'i'
            if (expected != actual) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String num = "030"; // Example input
        boolean result = digitCount(num);
        System.out.println("Result: " + result);
    }
}
//prasanna logic
//package ProblemSolving;
//
//public class DigitCounter {
//
//    public static boolean digitCount(String num) {
//        int i = 0;
//
//        while (i < num.length()) {
//            // Convert index i to character (i + '0')
//            char ch = (char)(i + '0');
//            // Get expected count from the digit at position i
//            int cur_digit = num.charAt(i) - '0';
//
//            // Count occurrences of character ch in the string
//            for (int j = 0; j < num.length(); j++) {
//                if (ch == num.charAt(j)) {
//                    cur_digit--;
//                }
//            }
//
//            // If count doesn't match, return false
//            if (cur_digit != 0) return false;
//
//            i++;
//        }
//
//        return true;
//    }
//
//    public static void main(String[] args) {
//        String num = "1210";  // Test input
//        boolean result = digitCount(num);
//        System.out.println("Result: " + result);
//    }
//}

