public class SwitchElseExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number (1, 2, or 3): ");
        int number = scanner.nextInt();

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

                System.out.println("You entered a number other than 1, 2, or 3.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}


