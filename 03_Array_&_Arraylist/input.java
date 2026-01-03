import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        arr[0] = 4;
        arr[1] = 3;
        arr[2] = 21;
        arr[3] = 34;
        arr[4] = 42;


        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        arr[2] = 0;

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }


        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0 ; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        for (int num:arr){
            System.out.println(num);
        }

        ArrayList a = new ArrayList<>(4);
            System.out.println(Arrays.toString(arr));



    }
}
