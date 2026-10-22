package ATMProject;
import java.util.Scanner;
public class ATMProject {
    public static Scanner sc = new Scanner(System.in);

    public static double balance = 1000.00;
    public static int pin = 1234;
    public static int depositCount = 0;
    public static double depositTotal = 0.00;
    public static int withdrawalCount = 0;
    public static double withdrawalTotal = 0.00;

    public static boolean login(){
        int attempts = 0;
        int i=0;
        do {
            System.out.print("Enter your PIN: "+(i++)+": ");
            int enteredPin = sc.nextInt();
            
            if(attempts >= 3) {
            System.out.println("Too many incorrect attempts. Exiting program.");
            break;
        }
            if (enteredPin == pin) {
                System.out.println("Login successful!");
                return true;
            } else {
                System.out.println("Incorrect PIN. Please try again.");
                attempts++;
            }
        
        
        } while (true);
        return false;
    }


    public static void Menu() {
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Account tier");
            System.out.println("5. Savings projection");
            System.out.println("6. Receipt summary");
            System.out.println("7. Change PIN");
            System.out.println("8. Exit");
            
    }
    
    

    public static void main(String[] args) {
          boolean exit = false;
        while (!exit) {

            if (!login()) {
                System.out.println("Card Locked!");
                break;
            }
            else{
                System.out.println("Welcome to the ATM!");
            }
            Menu();

            System.out.print("Please enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        sc.close();
    }
}


