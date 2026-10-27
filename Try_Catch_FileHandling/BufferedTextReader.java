package Try_Catch_FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTextReader {
    public static void main(String[] args) {
        try {
            BufferedReader buff = new BufferedReader(new FileReader("BufferedReader.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("Bwriter.txt"));

            String line;
            System.out.println("content being read:");
            while ((line = buff.readLine()) != null) {
                System.out.println(line);
            }

            while ((line = buff.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Content copied successfully!");
            buff.close();
            writer.close();
        } catch (IOException e) {
            System.out.println("Error! something went wrong when copying file content" + e);
        }

    }
}
