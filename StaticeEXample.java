public class StaticExample {
    
    static int studentCount = 0;

    
    public static void incrementStudentCount() {
        studentCount++;
        System.out.println("Student count: " + studentCount);
    }

    
    public static void main(String[] args) {
        System.out.println("Demonstrating static methods and variables:");

        // Call the static method multiple times
        StaticExample.incrementStudentCount();
        StaticExample.incrementStudentCount();
        StaticExample.incrementStudentCount();
    }
}
