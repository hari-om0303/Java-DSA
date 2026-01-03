import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {55, 45, 535, 25, 15};
        bubble(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]
    }
    static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    // swap arr[j] and arr[j-1]
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if no swaps → array already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
