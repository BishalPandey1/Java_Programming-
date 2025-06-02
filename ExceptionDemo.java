class ExceptionDemo {

    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Age must be at least 18");
        } else {
            System.out.println("Eligible for voting.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16); 
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
