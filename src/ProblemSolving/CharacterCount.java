package ProblemSolving;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    
    public static void getCountOfChars(String s) {
        HashMap<Character, Integer> counts = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            if (counts.containsKey(c)) {
                counts.put(c, counts.get(c) + 1);
            } else {
                counts.put(c, 1);
            }
        }

        // Optional: Print the character counts
        for (char i : counts.keySet()) {
            System.out.println(i + ": " + counts.get(i));
        }
        // Optional method-2:
//        // Loop using Map.Entry to print key-value pairs
//        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
//            System.err.println(entry.getKey() + " " + entry.getValue());
//        }
    }

    public static void main(String[] args) {
        getCountOfChars("programming");
    }
}

