public class linear_search {
    public static void main(String[] args) {
        int [] arr = {1,2,3,9,5,4};
        System.out.println(search(arr, 0, 5));
    }
    static int search(int [] arr, int ind, int targ){
        if (ind == arr.length){
            return -1;
        }
        if (arr[ind] == targ){
            return ind;
        }
        return  search(arr, ind+1, targ);
    }
}
