import java.util.Arrays;
import java.util.Random;

public class stringbuffer {
    public static void main(String[] args) {
//        constructor 1
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());

//        constructor 2
        StringBuffer sb2 = new StringBuffer("hii");
        System.out.println(sb2);
        System.out.println(sb2.capacity());

//        constructor 3
        StringBuffer sb3 = new StringBuffer();
        sb3.append("hii ");
        sb3.append("kese ho");

        sb3.replace(11,22, " hari ommmm");

        sb3.delete(0,3);
        sb3.insert(0 , "hiiiii");
        System.out.println(sb3);

        String s1 = sb3.toString();
        System.out.println(s1);

//        removing white Spaces
        String s2 = "hiii kesi ho";
        String ans1 = s2.replaceAll("\\s" , "");
        System.out.println(ans1);

//        split
        String s3 = "hii,kese,ho,bodybuilder";
        String [] arr = s3.split(",");
        System.out.println(Arrays.toString(arr));

    }
}
