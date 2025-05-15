package Collections;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();

        // adding the elements at the specific position
        a.add(200);
        a.add(300);
        a.add(400);
        a.add(500);

        // Insert element at the beginning of the list (index 0)
        a.add(0, 1000);

        
        ArrayList<Object> mix= new ArrayList<>();
        
        mix.add(100);
        mix.add("String");
        mix.add(0.9);
        mix.add(100000);
//        if you store dynamically typed array,u can print using System.out.println();a.if u want to use .get,need type casting
        int num=(int) mix.get(0);
        String str1=(String) mix.get(1);
        System.out.println(mix);
        System.out.println(num);
        System.out.println(str1);
//           size is used give no of element in array
        for (int i = 0; i < a.size(); i++) {
//        	.get is used to get the element with its index
            System.out.println(a.get(i));
        }
    }
}


//hasnext:
//	this method checks if there are more elements available in the iteration.
//it returns true if they are next element or false otherwise
//Note:It does not move the iterators position.
//
//Next:this method returns the next element in the iteration and advances the iterators position to the subsequent element.
//Note:if there is no more element it throws "NosuchElement" Exception.