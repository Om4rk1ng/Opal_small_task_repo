package Try_Catch_FileHandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTextReader {
    public static void main(String[] args) throws IOException {
        BufferedReader buff=new BufferedReader(new FileReader("BufferedReader.txt"));
        BufferedWriter writer=new BufferedWriter(new FileWriter("Bwriter.txt"));

        String line;
        while ((line = buff.readLine()) != null) {
            writer.write(line);
            writer.newLine();
        }
        System.out.println("Content copied successfully!");
        buff.close();
        writer.close();
    }
}
