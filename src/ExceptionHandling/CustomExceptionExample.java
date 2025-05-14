package ExceptionHandling;

public class CustomExceptionExample extends Exception {

    private static int accno[] = {1001, 1002, 1003, 1004, 1005};
    private static String name[] = {"Nish", "Prasun", "Sam", "Buddha","Sidhu"};
    private static double bal[] = {10000.00, 12000.00, 999.00, 678997.00,134000.00};

    public CustomExceptionExample() {
        // TODO Auto-generated method stub
    }

    public CustomExceptionExample(String str) {
        super(str);
    }

    public static void main(String[] args) {
        try {
            System.out.println("ACCNO" + "\t" + "NAME" + "\t" + "BALANCE");
            for (int i = 0; i < 6; i++) {
                System.out.println(accno[i] + "\t" + name[i] + "\t" + bal[i]);
                if (bal[i] < 1000) {
                    CustomExceptionExample me = new CustomExceptionExample("Balance is less than 1000");
                    throw me;
                }
            }
        } catch (CustomExceptionExample me) {
            me.printStackTrace();
        }
    }
}