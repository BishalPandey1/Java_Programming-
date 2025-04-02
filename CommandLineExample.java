public class CommandLineExample {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide at least two arguments: name and age.");
        } else {
            // Retrieve arguments
            String name = args[0];
            int age = Integer.parseInt(args[1]); // Convert second argument to integer

            // Display the input
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
}
