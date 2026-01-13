package Questions;

import java.util.HashSet;

public class insertion_of_2_arr {
    public static int insertion(int [] arr1, int [] arr2){
        int count=0;
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i< arr1.length; i++){
            set.add(arr1[i]);
        }
        for (int j=0; j< arr2.length; j++){
            if (set.contains(arr2[j])){
                count++;
                set.remove(arr2[j]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr1 = {7,3,9,6};
        int [] arr2 = {6,3,9,2,9,4,1,7};
        int ans = insertion(arr1,arr2);
        System.out.println(ans);
    }
}
