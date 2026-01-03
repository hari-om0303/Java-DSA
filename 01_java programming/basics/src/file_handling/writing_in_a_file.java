package file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class writing_in_a_file {
    public static void main(String[] args) {
        try {
            // Create a FileWriter object to write to the file
            FileWriter fw = new FileWriter("D:\\java dsa\\java programming\\basics\\src\\file_handling\\createdfile.txt");

            // Write content
            fw.write("Hii! Hari Om, kaise ho?");

            // Close the FileWriter to save changes
            fw.close();

            System.out.println("Successfully written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
