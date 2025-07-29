public class ControlStatementsDemo {
    public static void main(String[] args) {

        // 1️⃣ if statement
        int number = 10;
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        }

        // 2️⃣ switch statement
        String grade = "B";
        switch (grade) {
            case "A":
                System.out.println("Excellent!");
                break;
            case "B":
                System.out.println("Good job!");
                break;
            case "C":
                System.out.println("Keep improving!");
                break;
            default:
                System.out.println("Invalid grade.");
        }

        // 3️⃣ loop statement with continue and break
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping number " + i); // 4️⃣ continue statement
                continue;
            }
            if (i == 4) {
                System.out.println("Breaking at number " + i); // 5️⃣ break statement
                break;
            }
            System.out.println("Count: " + i);
        }
    }
}
