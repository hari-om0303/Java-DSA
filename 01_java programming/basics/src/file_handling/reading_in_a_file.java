package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class reading_in_a_file {
    public static void main(String[] args) {
        File f = new File("D:\\java dsa\\java programming\\basics\\src\\file_handling\\createdfile.txt");
        try{
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
