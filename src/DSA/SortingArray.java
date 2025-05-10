package DSA;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the length of array:");
		int n=scan.nextInt();
		int[] arr= new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				int temp=0;
				if(arr[j]>arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}

		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");}

		// TODO Auto-generated method stub

	}

}

