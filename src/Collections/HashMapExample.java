package Collections;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String args[]) {
        HashMap<Integer, String> studentData = new HashMap<>();

        studentData.put(1, "Nirmal");
        studentData.put(2, "Durga");

        System.err.println(studentData.get(1));
    }
}

