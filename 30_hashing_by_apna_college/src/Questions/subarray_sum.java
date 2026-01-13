package Questions;

import java.util.HashMap;

public class subarray_sum {
    public static int subarraysum(int [] arr , int k){
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0,1);

        int sum=0;
        int ans=0; //frequency

        for (int j=0; j<arr.length; j++ ){
            sum += arr[j];

            if (map.containsKey(sum - k)){
                ans += map.get(sum-k);
            }

            if (map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
            }else {
                map.put(sum , 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {10,2,-2,-20,10};
        System.out.println(subarraysum(arr, -10));
    }
}
