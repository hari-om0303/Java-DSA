package Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leet_229 {
    public List<Integer> majorityElement(int [] nums){
        List<Integer> l = new ArrayList<>();
        HashMap<Integer , Integer> map = new HashMap<>();

        for (int i=0; i< nums.length; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else {
                map.put(nums[i], 1 );
            }
        }

        for (int key : map.keySet()){
            if (map.get(key)> nums.length/3){
                l.add(key);
            }
        }
        return l;
    }

    public static void main(String[] args) {
        leet_229 obj = new leet_229();
//        int num [] = {1,3,2,5,1,3,1,5,1};
//        int num [] = {3,2,3};
        int num [] = {1,2};
       List<Integer>  ans = obj.majorityElement(num);
        System.out.println(ans);
    }

}
