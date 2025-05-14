package ExceptionHandling;

public class ClassNotImpl {

    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("ProblemSolving.ReverseArray");
            System.out.println("Class is found " + cls.getName());
        } catch (ClassNotFoundException e) {
            System.err.println("Class Not Found " + e.getMessage());
            e.printStackTrace(); // ✅ Fixed here
        }
    }
}
