import java.util.Arrays;

public class swapping {
    public static void main(String[] args) {
        int [] arr = {1,4,3,2,5};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr, int indx1, int indx2 ){
        int temp = arr[indx1];
        arr[indx1] = arr[indx2];
        arr[indx2] = temp;

    }
}
