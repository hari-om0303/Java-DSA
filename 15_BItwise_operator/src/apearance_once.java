public class apearance_once {
    public static void main(String[] args) {
        int [] arr = {2,3,3,2,7,1,5,5,1};
        System.out.println(Once(arr));
    }
    static int Once(int [] arr){
        int once=0;
        for (int i=0; i< arr.length; i++){
            once ^= arr[i];
        }
        return once;
    }
}
