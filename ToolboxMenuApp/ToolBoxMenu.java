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
            System.out.print("0.Exit");
            System.out.println("Please select an option:");
            int option = sc.nextInt();

            switch (option) {
                case 1:

                    celsiusToFahrenheit();
                    break;
                case 2:
                    evenOrOdd();
                    break;
                case 3:
                    maxOfThree();
                    break;
                case 4:
                    factorial();
                    break;
                case 5:
                    multiplicationTable();
                    break;
                case 6:
                    starTriangle();
                    break;
                case 7:
                    isPrime();
                    break;
                case 8:
                    reverseNumber();
                    break;
                case 9:
                    numberPyramid();
                    break;
                case 0:
                    exit = true;
                    System.out.println("Thank you for using the Toolbox Menu. Goodbye!");
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
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
        
}