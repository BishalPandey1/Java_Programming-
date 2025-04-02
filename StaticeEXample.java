public class StaticExample {
    // Static variable
    static int studentCount = 0;

    // Static method to increment and display the student count
    public static void incrementStudentCount() {
        studentCount++;
        System.out.println("Student count: " + studentCount);
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Demonstrating static methods and variables:");

        // Call the static method multiple times
        StaticExample.incrementStudentCount();
        StaticExample.incrementStudentCount();
        StaticExample.incrementStudentCount();
    }
}
