package ATMProject;
import java.util.Scanner;
public class ATMProject {
    public static Scanner sc = new Scanner(System.in);

    public static double balance = 1000.00;
    public static double updatedBalance = balance;
    public static int pin = 1234;
    public static int depositCount = 0;
    public static double depositTotal = 0.00;
    public static int withdrawalCount = 0;
    public static double withdrawalTotal = 0.00;
    public static  double interest=0;

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
    
    public static void checkBalance() {
        System.out.println("Your current balance is: $" + updatedBalance);
    }

    public static void deposit(){

        System.out.print("enter amount to deposit: ");
        double amount = sc.nextDouble();
        if (amount >= 0 && amount < 5000) {
            System.out.println("Invalid deposit amount. enter a positive value.");
        }
         else {
            updatedBalance += amount;
            depositCount++;
            depositTotal += amount;
            System.out.println("Deposit successful. New balance:" + updatedBalance);
        }
    }
    

    public static void withdraw(){
        System.out.print("enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount <= 0 && amount % 10 == 0) {
            System.out.println("Invalid withdrawal amount. enter a positive value.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else if (amount > 1000) {
            System.out.println("Withdrawal limit exceeded. Maximum withdrawal is $1000.");
        } else {
            if(amount <= 500){
                double fee =2.00;
            withdrawalCount++;
            withdrawalTotal += amount;
            updatedBalance -= (amount + fee);

            System.out.println("fee:"+fee);
            System.out.println("Withdrawal successful. New balance:" + updatedBalance);
            }
            else if( amount > 500){
                double fee =5.00;
            withdrawalCount++;
            withdrawalTotal += amount;
            updatedBalance -= (amount + fee);

            System.out.println("fee:"+fee);
            System.out.println("Withdrawal successful. New balance:" + updatedBalance);
            }
            
        }
    }

    public static double accountTier(){
         
        if(balance < 1000){
             interest=0.01;
           System.out.println("Tier:Bronze, Interest rate:"+ interest);
        }
        else if(balance > 1000 && balance <=5000){
            interest=0.02;
           System.out.println("Tier:silver, Interest rate:"+ interest);

        }
        else if(balance > 5000 && balance <=20000){
            interest=0.03;
            System.out.println("Tier: gold,  Interest rate:"+ interest);

        }
        else{
            interest=0.04;
            System.out.println("Tier: Platinum, Interest rate:"+ interest);

        }
        return interest;
    }

    public static void savingsProjection(int years){
        if(balance < 1000){
             interest=0.01;
           
        }
        else if(balance > 1000 && balance <=5000){
            interest=0.02;
           

        }
        else if(balance > 5000 && balance <=20000){
            interest=0.03;
            

        }
        else{
            interest=0.04;
            

        }
        double yearlyB=updatedBalance*interest;
        for(int i = 1;i<= years;i++){
            System.out.println("year"+i+": "+(updatedBalance-yearlyB));
        }

    }

    public static void receiptSummary(){
       
        System.out.print("Deposits: "+depositCount+" ");
        System.out.println("Total: "+depositTotal+" ");
        System.out.print("Withdrawals: "+withdrawalCount+" ");
        System.out.println("Total: "+withdrawalTotal+" ");
        System.out.println("Balance: "+updatedBalance+" ");
    }

    public static void changePin(){
        System.out.print("Enter your current (old) PIN: ");
    int oldPin = sc.nextInt();

    
    if (oldPin != pin) {
        System.out.println("Incorrect old PIN. PIN change failed.");
        return;
    }

    System.out.print("Enter your new 4-digit PIN (1000-9999): ");
    int newPin = sc.nextInt();

    // 2. Validate that it's a 4-digit number (1000 to 9999)
    if (newPin < 1000 || newPin > 9999) {
        System.out.println("Invalid PIN. Must be exactly 4 digits (1000-9999). PIN change failed.");
        return;
    }

    System.out.print("Confirm your new PIN: ");
    int confirmPin = sc.nextInt();

   
    if (newPin == confirmPin) {
        pin = newPin; 
        System.out.println("PIN successfully changed!");
    } else {
        System.out.println("PINs do not match. PIN change failed.");
    }
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
                    accountTier();
                    break;
                case 5:
                    System.out.println("enter number of years from 1 to 10");
                    int years= sc.nextInt();
                    savingsProjection(years);
                    break;
                case 6:
                    receiptSummary();
                    break;
                case 7:
                    changePin();
                    break;
                case 8:
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


