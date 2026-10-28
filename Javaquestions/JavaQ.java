package Javaquestions;

import java.util.Scanner;

public class JavaQ {
    public static Scanner sc = new Scanner(System.in);

    public static int InputValium() {
        int n = sc.nextInt();
        sc.nextLine();
        return n;
    }

    public static void main(String[] args) {
        // Paper 1 Hollow Square
        int n1 = InputValium();
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n1; j++) {
                if (i == 1 || i == n1 || j == 1 || j == n1) {
                    System.out.print("* ");
                } else {

                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        int n2 = InputValium();
        for (int i = 0; i <= n2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        int n3 = InputValium();

        for (int i = n3; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        int n4 = sc.nextInt();
        for (int i = 1; i <= n4; i++) {
            for (int j = 1; j <= n4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n4 - 1; i >= 1; i--) {
            for (int j = 1; j <= n4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int n5 = InputValium();

        for (int i = 1; i <= n5; i++) {
            for (int j = 1; j <= n5 - i; j++) {
                System.out.print(" ");
            }

            if (i == 1) {
                System.out.print("*");
            } else {
                System.out.print("*");
                for (int j = 1; j <= (2 * i - 3); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n5 - 1; i >= 1; i--) {
            for (int j = 1; j <= n5 - i; j++) {
                System.out.print(" ");
            }

            if (i == 1) {
                System.out.print("*");
            } else {
                System.out.print("*");
                for (int j = 1; j <= (2 * i - 3); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        int n6 = InputValium();

        for (int i = 1; i <= n6; i++) {
            for (int j = 1; j <= n6; j++) {
                if (i == j || i + j == n6 + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        int n7 = InputValium();

        for (int i = n7; i >= 1; i--) {
            for (int j = 1; j <= n7 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 2; i <= n7; i++) {
            for (int j = 1; j <= n7 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int n8 = InputValium();
        for (int i = 0; i < n8; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (65 + n8 - 1 - j));
            }
            System.out.println();
        }

        int n9=sc.nextInt();
        int currentOdd = 1;
        
        if (n9 <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            
            return;
        }
        
        
        for (int u = 1; u <= n9; u++) {
            for (int j = 1; j <= u; j++) {
                System.out.print(currentOdd + " ");
                currentOdd += 2; 
            }
            System.out.println(); 
        }

                int n10=sc.nextInt();

        if (n10 % 2 == 0) {
            System.out.println("Error: Please enter an odd number.");
            return;
        }
        
        int mid = (n10 + 1) / 2;
        
        for (int p = 1; p <= n10; p++) {
            for (int j = 1; j <= n10; j++) {
                if (p == mid || j == mid) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

