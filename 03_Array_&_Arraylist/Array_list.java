import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(34);
        l.add(40);
        l.add(12);
        System.out.println(l);


        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int n = in.nextInt();
        for (int i=0; i< n ; i++){
            list.add(in.nextInt());
        }
        for (int i=0; i< n ; i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
