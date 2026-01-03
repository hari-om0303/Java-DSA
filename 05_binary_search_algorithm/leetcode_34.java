import java.util.Arrays;

public class leetcode_34 {
        public static void main(String[] args) {
            int [] arr = {5,7,7,8,8,10,10,10};
            int targ = 7;
            int [] ans = searchRange(arr,targ);
            System.out.println(Arrays.toString(ans));
        }
        public static int[] searchRange(int[] arr, int targ) {
            int [] ans = {-1,-1};
            int start = search(arr, targ, true);
            int end  = search(arr, targ, false);

            ans[0] = start;
            ans[1] = end;
            return ans ;
        }
       static int search(int [] arr, int targ, boolean findstartindex){
            int ans = -1;
            int s =0;
            int e = arr.length-1;
            while (s<=e){
            int mid =  s +(e-s)/2;
                if(arr[mid]>targ){
                    e = mid-1;
                }else if(targ>arr[mid]){
                    s = mid+1;
                }else {
                    ans = mid;
                    if (findstartindex){
                        e= mid-1;
                    }else {
                        s = mid+1;
                    }
                }
            }
            return ans;
        }
    }


