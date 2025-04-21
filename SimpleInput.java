import java.util.Scanner;  

public class SimpleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); 

        System.out.print("Enter your age: ");
        int age = sc.nextInt();  

        System.out.println("\n--- Your Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        sc.close();  
    }
}
