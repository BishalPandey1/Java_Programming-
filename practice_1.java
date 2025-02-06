// Base class: Account
class Account {
    private String accountNumber;
    private double balance;

    // Constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Display balance
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}

// Derived class: SavingsAccount (inherits from Account)
class SavingsAccount extends Account {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Call the base class constructor
        this.interestRate = interestRate;
    }

    // Method to add interest
    public void addInterest() {
        double interest = getBalance() * interestRate / 100; // Fixed: Using getBalance()
        deposit(interest);
        System.out.println("Interest added: $" + interest);
    }

    // Override displayBalance to include interest rate
    @Override
    public void displayBalance() {
        super.displayBalance();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class to test the banking system
public class BankingSystem {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("SA12345", 1000.0, 5.0);

        // Display initial balance
        savingsAccount.displayBalance();

        // Deposit money
        savingsAccount.deposit(500.0);

        // Withdraw money
        savingsAccount.withdraw(200.0);

        // Add interest
        savingsAccount.addInterest();

        // Display final balance
        savingsAccount.displayBalance();
    }
}
