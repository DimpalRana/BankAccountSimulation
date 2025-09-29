import java.util.Scanner;
class BankAccount {
private double balance;

// Constructor
public BankAccount(double initialBalance) {
    balance = initialBalance;
}

// Deposit method
public void deposit(double amount) {
    balance += amount;
    System.out.println("✅ Deposited: " + amount);
    checkBalance(); // show balance after deposit
}

// Withdraw method
public void withdraw(double amount) {
    if (amount <= balance) {
        balance -= amount;
        System.out.println("✅ Withdrawn: " + amount);
        checkBalance(); // show balance after withdraw
    } else {
        System.out.println("❌ Insufficient balance!");
    }
}


// Check balance method
public void checkBalance() {
    System.out.println("💰 Current Balance: " + balance);
}


}

public class Task5_BankAccountSimulation {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
BankAccount account = new BankAccount(0); // starting balance = 1000


    int choice;
    do {
        System.out.println("\n--- Bank Menu ---");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter amount to deposit: ");
                double depositAmount = sc.nextDouble();
                account.deposit(depositAmount);
                break;
            case 2:
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = sc.nextDouble();
                account.withdraw(withdrawAmount);
                break;
            case 3:
                account.checkBalance();
                break;
            case 4:
                System.out.println("👋 Thank you for using the bank system!");
                break;
            default:
                System.out.println("❌ Invalid choice!");
        }
    } while (choice != 4);

    sc.close();
}


}
