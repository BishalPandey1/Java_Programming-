public class SwitchElseExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number (1, 2, or 3): ");
        int number = scanner.nextInt();

        // Use a switch statement to check the value of the number
        switch (number) {
            case 1:
                System.out.println("You entered 1.");
                break;
            case 2:
                System.out.println("You entered 2.");
                break;
            case 3:
                System.out.println("You entered 3.");
                break;
            default:
                // If the number is not 1, 2, or 3, print a default message
                System.out.println("You entered a number other than 1, 2, or 3.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}
