package file_handling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class creating_a_file {
    public static void main(String[] args) {
        File f = new File("D:\\java dsa\\java programming\\basics\\src\\file_handling\\createdfile.txt");
        try{
            f.createNewFile();
            System.out.println("file created successfully");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
