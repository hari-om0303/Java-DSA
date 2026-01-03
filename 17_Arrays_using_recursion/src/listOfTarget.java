import java.util.ArrayList;

public class listOfTarget {
    public static void main(String[] args) {
        int [] arr = {1,2,3,9,4,5,4};
        ArrayList<Integer> result = search(arr, 0, 12, new ArrayList<>());
        System.out.println(result);
    }

    static ArrayList<Integer> search(int [] arr, int ind, int targ, ArrayList<Integer> list){
        if (ind == arr.length){
            return list;
        }
        if (arr[ind] == targ){
            list.add(ind);
        }
        return  search(arr, ind+1, targ,list);
    }
}
