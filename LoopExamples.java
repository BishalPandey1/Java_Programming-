public class LoopExamples {

    public static void main(String[] args) {
      
        int[] numbers = {1, 2, 3, 4, 5};

     
        System.out.println("Using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

       
        System.out.println("\nUsing while loop:");
        int j = 0;
        while (j < numbers.length) {
            System.out.println("Element at index " + j + ": " + numbers[j]);
            j++;
        }

       
        System.out.println("\nUsing do-while loop:");
        int k = 0;
        do {
            System.out.println("Element at index " + k + ": " + numbers[k]);
            k++;
        } while (k < numbers.length);

        
        System.out.println("\nUsing enhanced for loop (for-each loop):");
        for (int number : numbers) {
            System.out.println("Element: " + number);
        }
    }
}
