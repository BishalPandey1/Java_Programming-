public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            double result = 1.0 / 0.0; 
            
            if (Double.isInfinite(result)) {
                throw new ArithmeticException("Infinity detected!");
            }
            
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Cannot work with infinity!");
        }
    }
}


