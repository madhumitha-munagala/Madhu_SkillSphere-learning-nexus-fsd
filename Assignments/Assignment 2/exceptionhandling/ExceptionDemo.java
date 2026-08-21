package exceptionhandling;

public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Exception Caught");
            
        }
    }
}