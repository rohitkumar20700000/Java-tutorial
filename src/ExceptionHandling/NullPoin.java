package ExceptionHandling;

public class NullPoin {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            String a=null,b="Hello";
            System.out.println("Hello");
            System.out.println(a.charAt(0));
            System.out.println(b.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("Null pointer");
        }
    }

}

//in above example,"Null pointer" in exception(catch) is raised for a.charAt(0)