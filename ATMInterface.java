import java.util.Scanner;

class ATM 
{
    private double balance;

    public ATM(double initialBalance)
    {
        balance = initialBalance;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void deposit(double amount) 
    {
        balance =balance + amount;
    }

    public void withdraw(double amount) 
    {
        if (amount > balance) 
        {
            System.out.println("Insufficient funds. Withdrawal canceled.");
        } else 
        {
            balance = balance - amount;
            System.out.println("Withdrawn: $" + amount);
        }
    }
}

public class ATMInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(1000.0); // Initialize ATM with $1000

        while (true) {
            System.out.println("Welcome to the ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.println("Balance: " + atm.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    System.out.println("Deposited: " + depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}
