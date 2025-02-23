public class LoopExamples {

    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 2, 3, 4, 5};

        // 1. for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // 2. while loop
        System.out.println("\nUsing while loop:");
        int j = 0;
        while (j < numbers.length) {
            System.out.println("Element at index " + j + ": " + numbers[j]);
            j++;
        }

        // 3. do-while loop
        System.out.println("\nUsing do-while loop:");
        int k = 0;
        do {
            System.out.println("Element at index " + k + ": " + numbers[k]);
            k++;
        } while (k < numbers.length);

        // 4. Enhanced for loop (for-each loop)
        System.out.println("\nUsing enhanced for loop (for-each loop):");
        for (int number : numbers) {
            System.out.println("Element: " + number);
        }
    }
}
