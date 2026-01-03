import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        Quik(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void Quik(int [] arr, int low, int hi){
        if (low >= hi){
            return;
        }
        int s = low;
        int e = hi;
        int mid = s+(e-s)/2;
        int piv = arr[mid];

        while (s<=e){
            while (arr[s]<piv){
                s++;
            }
            while (arr[e]>piv){
                e--;
            }
            if (s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        Quik(arr, low,e);
        Quik(arr, s ,hi);
    }
}
