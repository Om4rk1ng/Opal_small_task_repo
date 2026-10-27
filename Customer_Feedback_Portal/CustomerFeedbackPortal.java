package Customer_Feedback_Portal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CustomerFeedbackPortal {

    public static Scanner Sc = new Scanner(System.in);
    public static int count = 0;

    public static void Addfeedback(String[] names, int[] ratings, String[] comments) throws IOException {

        if (count >= names.length) {
            System.out.println("Feedback storage is full!");
            return;
        }

        System.out.print("Enter name: ");
        String name = Sc.nextLine();
        Sc.nextLine();

        System.out.print("Write comment: ");
        String comment = Sc.nextLine();
        Sc.nextLine();

        System.out.print("Enter rating from 1 to 5: ");
        int rating = Sc.nextInt();
        Sc.nextLine();

        if (rating < 1 || rating > 5) {
            System.out.println("rating must be between 1 to 5, can't be above...");
        } else {
            names[CustomerFeedbackPortal.count] = name;
            ratings[CustomerFeedbackPortal.count] = rating;
            comments[CustomerFeedbackPortal.count] = comment;
            count++;
        }

    }

    public static void Showall(String[] names, int[] ratings, String[] comments) throws IOException {
        if (count == 0) {
            System.out.println("\nNo feedback available yet.\n");
            return;
        }
        System.out.println("\n--- ALL FEEDBACK ---");
        for (int i = 0; i < count; i++) {
            System.out.println(names[i] + "|" + ratings[i] + "|" + comments[i]);
        }
        System.out.println();
    }

    public static void showAverage(int[] ratings) throws IOException {
        int sum = 0;
        int avg = 0;
        for (int rating : ratings) {
            sum += rating;
        }

        avg = sum / count;

        System.out.println("Average of ratings: " + avg);
        int lowest = 0;
        int highest = 0;
        for (int i = 0; i < count; i++) {
            if (ratings[i] > highest) {
                highest = ratings[i];
            }

            // 2. Check for a new lowest rating
            if (ratings[i] < lowest) {
                lowest = ratings[i];
            }
        }

        System.out.print("Highest Rating: ");

        for (int s = 0; s < highest; s++)
            System.out.print("*");
        System.out.println(" (" + highest + ")");

        System.out.print("Lowest Rating:  ");
        for (int s = 0; s < lowest; s++)
            System.out.print("*");
        System.out.println(" (" + lowest + ")");
    }

    public static void searchByRating(String[] names, int[] ratings, String[] comments) throws IOException {
        System.out.print("Search by rating from 1 to 5: ");
        int SearchR = Sc.nextInt();
        Sc.nextLine();

        if (SearchR < 1 || SearchR > 5) {
            System.out.println("rating must be between 1 to 5, can't be above...");
        } else {
            for (int i = 0; i < count; i++) {
                if (SearchR == ratings[i]) {
                    System.out.println(
                            "name: " + names[i] + " Rating: " + " |" + ratings[i] + "| " + "Feedback: " + comments[i]);
                    break;
                }
            }

        }
    }

    public static void deleteFeedback(String[] names, int[] ratings, String[] comments) throws IOException {
        int targetIndex = Sc.nextInt();
        for (int i = targetIndex; i < count - 1; i++) {
            names[i] = names[i + 1];
            ratings[i] = ratings[i + 1];
            comments[i] = comments[i + 1];
        }

        names[names.length - 1] = null;
        ratings[names.length - 1] = 0;
        comments[names.length - 1] = null;
    }

    public static void saveFeedback(String[] names, int[] ratings, String[] comments) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("Feedback.txt"));

        for (int i = 0; i < count; i++) {
            writer.write(names[i] + "|" + ratings[i] + "|" + comments[i]);
            writer.newLine();
        }
        System.out.println("Data saved successfully!");
        writer.close();
    }

    public static void loadFeedback(String[] names, int[] ratings, String[] comments) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Feedback.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("\\|");
            names[count] = parts[0];
            ratings[count] = Integer.parseInt(parts[1]);
            comments[count] = parts[2];
            count++;
        }
        reader.close();
    }

    public static void main(String[] args) {
        String[] names = new String[100];
        int[] ratings = new int[100];
        String[] comments = new String[100];

        boolean exit = false;

        try {
            while (!exit) {
                System.out.println("===== CUSTOMER FEEDBACK PORTAL =====");
                System.out.println("1. Add feedback");
                System.out.println("2. Show all feedback");
                System.out.println("3. Show average rating");
                System.out.println("4. Search by rating");
                System.out.println("5. Delete feedback");
                System.out.println("6. Save to file");
                System.out.println("7. Save and exit");
                System.out.print("Choose: ");
                int option = Sc.nextInt();
                Sc.nextLine();

                switch (option) {
                    case 1:
                        Addfeedback(names,ratings,comments);
                        break;
                    case 2:
                        Showall(names,ratings,comments);
                        break;
                    case 3:
                        showAverage(ratings);
                        break;
                    case 4:
                        searchByRating(names,ratings,comments);
                        break;
                    case 5:
                        deleteFeedback(names,ratings,comments);
                        break;
                    case 6:
                        saveFeedback(names,ratings,comments);
                        loadFeedback(names,ratings,comments);
                        break;
                    case 7:
                        saveFeedback(names,ratings,comments);
                        System.out.println("Exiting program. Goodbye!");
                        exit = true;
                        break;

                    default:
                        System.out.println("invalid option! enter numbers from 1 to 7.");
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong went saving content into the file or reading file content ");
        }

        
        Sc.close();
    }
    
}
