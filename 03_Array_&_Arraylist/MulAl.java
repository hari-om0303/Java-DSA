import java.util.ArrayList;
import java.util.Scanner;

public class MulAl {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Creating empty rows
        for (int i = 0; i < 3; i++) {
            l.add(new ArrayList<>()); // Each row is an ArrayList<Integer>
        }

        // Taking input for 3x3 matrix
        System.out.println("Enter 9 numbers:");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                l.get(r).add(sc.nextInt());
            }
        }

        System.out.println(l);
    }
}
