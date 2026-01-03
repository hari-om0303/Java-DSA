//Divide and Conquer recurrence relation

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,6,7,8};
       int targ = 6;
      int ans = Search(arr, targ, 0, arr.length-1);
        System.out.println(ans);
    }

    static int Search(int [] arr, int targ, int s , int e){
        if (s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if (arr[m] == targ){
            return m;
        }
        if (targ>arr[m]){
            return Search(arr, targ, m+1, e);
        }
        return Search(arr, targ, s, m-1);
    }
}
