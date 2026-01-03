public class RotetedBS {
    public static void main(String[] args) {
        int [] arr = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr, 3, 0, arr.length-1));
    }
    static int search(int [] arr, int targ, int s ,int e){
        if (s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if (arr[m] == targ){
            return m;
        }
        if (arr[s]<=arr[m]){
            if (targ >= arr[s] && targ <= arr[m]){
                    return search(arr, targ, s, m-1);
            }else {
                return search(arr, targ, m+1, e);
            }
        }
       if (targ >= arr[m] && targ<= arr[e]){
           return search(arr, targ,m+1, e);
       }else {
           return search(arr, targ,s, m-1);
       }
    }
}
