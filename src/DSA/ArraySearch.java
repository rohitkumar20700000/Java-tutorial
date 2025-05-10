package DSA;
import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the length of array:");
		int n=scan.nextInt();
		int[] arr= new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the element need to search");
       
		int target=scan.nextInt();
		boolean found=false;
		for (int i=0;i<n;i++) {
			if (arr[i]==target) {
				System.out.println("Element found at index"+i);
				found=true;
				break;
			}
		}
		if (!found) {
			System.out.println("Element not found");
		}
		scan.close();
		

	}
	

}
