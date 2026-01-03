import java.util.Arrays;
import java.util.Scanner;

public class two_D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[2][2];

        // input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

//        output through enhanced for loop
            for (int [] a : arr){
                System.out.println(Arrays.toString(a));
            }
    }
}
