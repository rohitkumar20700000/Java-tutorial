package ExceptionHandling;

public class Exception_OddNumber {

    public static void main(String[] args) {
        int n = 13;
        int g = 8;
        tryNumber(n);
        checkEvenNumber(g);
    }

    public static void tryNumber(int n) {
        try {
            checkEvenNumber(n);
            System.out.println(n + " is even.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void checkEvenNumber(int number) {
        if (number % 2 != 0) {
            throw new IllegalArgumentException(number + " is odd.");
        }
        System.out.println(number + " is even (from checkEvenNumber)");
    }
}
