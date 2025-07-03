package DSA;
import java.util.Scanner;

public class Target10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0,1, 2, 3, 4, 5, 6, 7, 8, 9};

        while (true) {
            System.out.println("Enter the number:");
            int number = sc.nextInt();

            for (int i = 0; i < arr.length; i++) {
                if (number + arr[i] == 10) {
                    System.out.println(arr[i]);
                }
            }

            System.out.print("want to check again? (yes/no): ");
            sc.nextLine(); 
            String confirm = sc.nextLine();

            if (confirm.equals("yes")) {
                continue;
            } else {
                break;
            }
        }

        sc.close();
    }
}
