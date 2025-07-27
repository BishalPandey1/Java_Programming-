public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; 
            System.out.println("Result: " + result);
            // In try we can find where error can be occure
        } catch (ArithmeticException e) {
            System.out.println("Oops! You can't divide by zero.");
        }

        System.out.println("Program continues after the catch block.");
    }
    // In catch we solve the problem wehere error can be occure and solve it.
}
