package DSA;
import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the length of array:");
		int n=scan.nextInt();
		int[] arr= new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}else if (arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("the minimum of array "+min);
		System.out.println("the maximum of array "+max);
	}

}
