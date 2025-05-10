package DSA;
import java.util.Scanner;

public class ScanningArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the length of array:");
		int n=scan.nextInt();
		int[] arr= new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("The array Elements with its index");
		for(int i=0;i<n;i++) {
			System.out.println(i+":"+arr[i]);
		}
		System.out.println("Element the element that need to access (0 to "+n+")");
		int m=scan.nextInt();
		if (m >=0 && m<n) {
		System.out.println("Element at index"+m+"is"+arr[m]);
		}else {
			System.out.println("Invalid Index! Enter the elemnt between 0 to "+(n-1));
		}
		
		scan.close();
		
			

	}

}
