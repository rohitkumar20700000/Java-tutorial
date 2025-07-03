package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class HashSetAllTypes {
    public static void main(String args[]) {
        // Creating an object of Set class
        // Declaring object of Integer type
        // Creating a Set 'a' and adding elements
        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(
            new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
        // Again declaring object of Set class
        // with reference to HashSet
        // Creating a Set 'b' and adding elements
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(
            new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));

        // ---------- Union ----------
        Set<Integer> u = new HashSet<Integer>(a);
        u.addAll(b); // Adds all elements from b (duplicates are ignored)
        System.out.print("Union of the two Set: ");
        System.out.println(u);

        // ---------- Intersection ----------
        Set<Integer> i = new HashSet<Integer>(a);
        i.retainAll(b); // Keeps only common elements
        System.out.print("Intersection of the two Set: ");
        System.out.println(i);

        // ---------- Symmetric Difference ----------
        Set<Integer> d = new HashSet<Integer>(a);
        d.addAll(b);       // d now has union of a and b
        Set<Integer> tmp = new HashSet<Integer>(a);
        tmp.retainAll(b);  // tmp has intersection
        d.removeAll(tmp);  // remove common elements to get symmetric difference
        System.out.print("Difference of the two Set: "+d);
        System.out.println(); // Added a newline for better output formatting
    }
}

//HashSet:Access fast,unOrder
//linkedSet:insert order maintain
//TreeSet: elements are in sorted


//Set is interface represent a collection of Unique elements
//can store null implementation
//It doesn't define any specific order
//Implementation of set:HashSet
//It doesn't guarantee any specific order of iteration
//"LinkedHashSet maintains a hash table with a linked list running through all its entries, so elements are iterated in the order they were inserted."
//TreeSet is a class that implements the SortedSet interface and extends the NavigableSet interface. It uses a Red-Black Tree internally to store elements in sorted order.
//Enum Set:IT is used when U have have a set of enum constant, need High performance