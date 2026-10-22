package Collections;
import java.util.Scanner;
public class Collection {
    static Scanner sc = new Scanner(System.in);

    static int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    static int avg(int[] arr, int sum){
        return sum/arr.length;
        
    }

    public static void printArray(int[] arr) {
        System.out.println("Sum: " + sum(arr));
        System.out.println("Average: " + avg(arr, sum(arr))+"\n");
    }
    ////////////////////////////////////////
    
    static int min(int[] arr){
        int Min=arr[0];
        for(int i=0; i< arr.length;i++){
            if(arr[i]<Min){
                 Min=arr[i];
            }
        }
        return Min;
    }

    static int max(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void printdiff(int[] arr) {
        System.out.println("Minimum: " + min(arr));
        System.out.println("Maximum: " + max(arr));
        System.out.println("Difference: " + (max(arr) - min(arr))+"\n");
    }

    static int CountEven(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }

    static int indexOf(int[] arr, int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                return i;
            }
        }
        System.out.println("Value not found.");
        return -1;
    }

    public static void printEvenCount(int[] arr) {
        
        System.out.println("Count of even numbers: " + CountEven(arr));
        System.out.println("Enter a value to search for:");
        int value = sc.nextInt();
        System.out.println("Index of " + value + ": " + indexOf(arr, value)+"\n");

    }

    static void reverseArray(int[] arr){
        System.out.print("Reversed Array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[arr.length-1-i] + " ");
        }
        System.out.println("\n");
    }

    static void printArrayOneLine(int[] arr){

        reverseArray(arr);
        System.out.print("Original Array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    static void countPassedFailed(int[] grades){
        int passed=0;
        int failed=0;
        for(int i=0;i<grades.length;i++){
            if(grades[i]>=50){
                passed++;
            } else {
                failed++;
            }
        }
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed+"\n");
    }

    public static void storeGrades(){
        int[] grades = new int[5];
        for(int i=0;i<grades.length;i++){
            System.out.print("enter grade for course " + (i+1) + ": ");
            int grade = sc.nextInt();
            grades[i] = grade;
        }
        countPassedFailed(grades);
    }



    public static void main(String[] args) {

        
        //question 1 sum and average of an array
        int[] numbers = {1, 2, 3, 4, 5};  // Example array of numbers
        printArray(numbers);
        
        //question 2 find min and max of an array
        int[] arr = {5, 2, 9, 1, 7};  // Example array of numbers
        printdiff(arr);

        //question 3 find count of even numbers and index of a value in an array
        int [] arr1 = {10, 3, 8, 6, 2};  // Example array of numbers
        printEvenCount(arr1);

        //question 4 new array to reverse the elements of an array and print array in one line
        int[] arr2 = {1, 2, 3, 4, 5};  // Example array of numbers

        printArrayOneLine(arr2);
      

        //question 5 write a method that store grades and another to count courses passed and failed
        storeGrades();
          sc.close();
    }
    
    
}


