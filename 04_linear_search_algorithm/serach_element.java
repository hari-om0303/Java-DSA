public class serach_element {
    public static void main(String[] args) {
     int [] arr = {12,42,43,65,44,45,2,34,45,5};
     int target = 45;
        System.out.println(linearSearch(arr,target));
    }
    static int linearSearch(int [] arr, int target){
        for (int i=0; i< arr.length; i++){
            if (target==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
