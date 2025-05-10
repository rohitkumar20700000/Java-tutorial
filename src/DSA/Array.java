package DSA;


public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Element at index"+i+":"+arr[i]);
		}
		

	}

}

//Array is a data structure, allows us to store multiple values of same data types in a single variable
//Key Features of array: 
//1.continues memory allocation which means elements are placed next to each other in a memory
//2.zero - based indexing
//3.Fixed length - size is fixed, cannot be changed
//4.can store primitive and objects
//Advantage-random access




//format of Array:
//type[] arrayName;
//int[] arrayName=new int[5];
//int firstElement=arrayName[position];
//arrayName[3]=20;
//int length=array.length;