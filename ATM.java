import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;
        int choice;
        do {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance -= withdraw;
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while ( *choice* != 4);
    }
}
