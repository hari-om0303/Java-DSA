public class binary_search {
    public static void main(String[] args) {
        int [] arr = {23,34,45,56,67,78,89};
        int targ = 89;
      int ans = binarySearch(arr,targ);
        System.out.println(ans);
    }
    static int binarySearch(int [] arr, int targ){
//     start = s , end = e
int s =0;
int e = arr.length-1;
        int mid =  s +(e-s)/2;
        for (int i=0; i< arr.length; i++){
            if(arr[mid]>targ){
                e = mid-1;
            }else if(targ>arr[mid]){
                s = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
