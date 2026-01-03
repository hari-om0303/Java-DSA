public class leetcode_852 {
    public static void main(String[] args) {
        int [] arr = {2,4,16,8,7,5,3,1};
        System.out.println(peakindexmountingarray(arr));
    }
    static int peakindexmountingarray(int [] arr){
        int s = 0;
        int e = arr.length-1;
       while (s<e){
           int mid = s +(e-s)/2;
           if (arr[mid]>arr[mid+1]){
               e = mid;
           }else {
               s = mid+1;
           }
       }
       return s;
    }
}
