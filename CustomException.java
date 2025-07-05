// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Main class
public class Main {
    public static void checkNumber(int num) throws CustomException {
        if (num < 0) {
            throw new CustomException("Negative number not allowed.");
        } else {
            System.out.println("Number is valid: " + num);
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5); // Change this to test other values
        } catch (CustomException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
