package file_handling;

import java.io.File;

public class deleting_a_file {
    public static void main(String[] args) {
        File f = new File("D:\\java dsa\\java programming\\basics\\src\\file_handling\\createdfile.txt");
       if(f.delete()){
           System.out.println("file is deleted :" + f.getName());
       }else {
           System.out.println("some error occured");
       }
    }
}
