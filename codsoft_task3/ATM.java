import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;

            do {
                System.out.println("Welcome to ATM Machine");
                System.out.println("1. Withdraw Cash");
                System.out.println("2. Deposit Cash");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.println("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        acc.withdrawCash();
                        break;
                    case 2:
                        acc.depositCash();
                        break;
                    case 3:
                        acc.checkBalance();
                        break;
                    case 4:
                        System.out.println("Thank you for using  our ATM Machine!");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } while (choice != 4);
        }

        
    }
}

class BankAccount {
    private double balance = 0;

    @SuppressWarnings("resource")
    public void withdrawCash() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to be withdrawn: ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully! Remaining balance: " + balance);
        }
        
    }

    @SuppressWarnings("resource")
    public void depositCash() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Amount deposited successfully! New balance: " + balance);
        
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }
    
}



