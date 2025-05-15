package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample2 {

    public static void main(String[] args) {
        // Creating an ArrayList
        List<Integer> list = new ArrayList<>();

        // Insert element at the beginning of the list (0)
        list.add(100);
        list.add(200);
        list.add(400);
        list.add(500);
        System.out.println("Initial list: " + list);

        System.out.println("\nIterating using Iterator:");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer num = it.next();
            System.out.print(num + " ");
        }
        System.out.println();

        List<Integer> list2 = new ArrayList<>();
        list2.add(800);
        list2.add(600);
        list2.add(700);
        System.out.println("\nList before shuffle: " + list2);
        Collections.shuffle(list2);
        System.out.println("List after shuffle: " + list2);

        System.out.println("List before reverse: " + list2);
        Collections.reverse(list2);
        System.out.println("List after reverse: " + list2);

        System.out.println("List before swap: " + list2);
        Collections.swap(list2, 0, 2);
        System.out.println("List after swap: " + list2);

        List<String> listString = new ArrayList<>();
        listString.add("Red");
        listString.add("Blue");
        listString.add("Green");
        listString.add("Yellow");
        listString.add("Black");
        System.out.println("\nList before sort: " + listString);
        Collections.sort(listString);
        System.out.println("List after sort: " + listString);

        List<String> listString2 = new ArrayList<>();
        listString2.add("Red");
        listString2.add("Blue");
        listString2.add("Green");
        listString2.add("Violet");
        listString2.add("Orange");

        List<String> listString3 = new ArrayList<>(listString); // Add all the first ArrayList
        listString3.addAll(listString2); // Add all elements of the second ArrayList
        System.out.println("\nCombined list (listString3): " + listString3);
    }
}