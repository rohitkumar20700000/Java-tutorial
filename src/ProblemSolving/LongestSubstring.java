/package ProblemSolving;

import java.util.*;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> hs = new HashSet<>();
        int i = 0, j = 0, max = 0;

        while (i < s.length()) {
            if (!hs.contains(s.charAt(i))) {
                hs.add(s.charAt(i));
                i++;
                max = Math.max(max, hs.size());
            } else {
                hs.remove(s.charAt(j++));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}