package file_handling;

import java.io.File;

public class file {
    public static void main(String[] args) {
        File f1 = new File("D:\\java dsa\\java programming");

        System.out.println(f1.exists());
        System.out.println(f1.canWrite());
        System.out.println(f1.length());
    }
}
