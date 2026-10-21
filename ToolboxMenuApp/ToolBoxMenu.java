package ToolboxMenuApp;

import java.util.Scanner;

public class ToolBoxMenu {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        boolean exit = false;
        do {
            System.out.println("Welcome to the Toolbox Menu");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Even or odd");
            System.out.println("3. Maximum of three numbers");
            System.out.println("4. Factorial");
            System.out.println("5. Multiplication table");
            System.out.println("6. Triangle of stars");
            System.out.println("7. Prime check");
            System.out.println("8. Reverse a number");
            System.out.println("9. Number pyramid");
            System.out.println("0.Exit");
            System.out.println("Please enter a number between 0 and 9");
            int option = sc.nextInt();

            switch (option) {
                case 1:

                    celsiusToFahrenheit();
                    System.out.println("(Menu is Shown Again)");
                    break;
                case 2:
                    evenOrOdd();
                    System.out.println("(Menu is Shown Again)");
                    break;
                case 3:
                    maxOfThree();
                    System.out.println("(Menu is Shown Again)");
                    break;
                case 4:
                    factorial();
                    System.out.println("(Menu is Shown Again)");
                    break;
                case 5:
                    multiplicationTable();
                    System.out.println("(Menu is Shown Again)");
                    break;
                case 6:
                    starTriangle();
                    System.out.println("(Menu is Shown Again)");
                    break;
                case 7:
                    isPrime();
                    System.out.println("(Menu is Shown Again)");
                    break;
                case 8:
                    reverseNumber();
                    System.out.println("(Menu is Shown Again)");
                    break;
                case 9:
                    numberPyramid();
                    System.out.println("(Menu is Shown Again)");
                    break;
                case 0:
                    exit = true;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (!exit);

        

        sc.close();
    
    }
    
    public static void celsiusToFahrenheit() {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        }

        public static void evenOrOdd() {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }

        public static void maxOfThree() {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            System.out.print("Enter third number: ");
            int num3 = sc.nextInt();

            int max = Math.max(num1, Math.max(num2, num3));
            System.out.println("The maximum of the three numbers is: " + max);
        }

        public static void factorial() {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        public static void multiplicationTable() {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            System.out.println("Multiplication table of " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }

        public static void starTriangle() {
            System.out.print("Enter the number of rows: ");
            int rows = sc.nextInt();
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public static void isPrime() {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            boolean isPrime = true;
            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        public static void reverseNumber() {
            System.out.print("Enter a number: ");
            String number = sc.nextLine();
            String reversed = new StringBuilder(number).reverse().toString();
            int reversedNumber = Integer.parseInt(reversed);
            System.out.println("Reversed number is: " + reversedNumber);
        }

        public static void numberPyramid() {
            System.out.print("Enter the number of rows: ");
            int rows = sc.nextInt();
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print(k);
                }
                System.out.println();
            }
        }
        



        
}