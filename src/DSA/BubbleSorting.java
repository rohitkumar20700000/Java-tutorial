package DSA;

import java.util.Scanner;

public class BubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the length of array:");
		int n=scan.nextInt();
		int[] arr= new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		for(int i = 0; i < n - 1; i++) {
		    for(int j = 0; j < n - i - 1; j++) {
		        if(arr[j] > arr[j + 1]) {
		            int temp = arr[j];
		            arr[j] = arr[j + 1];
		            arr[j + 1] = temp;
		        }
		    }
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
