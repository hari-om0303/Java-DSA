public class Finf_min {
    public static void main(String[] args) {
        int [] arr = {12,32,3,43,12,213,4,3,1,-8};
        min(arr);
    }
    static void min(int [] arr){
        int minval = arr[0];
        for (int indx=0 ; indx< arr.length; indx++){
            if (arr[indx]<minval){
                minval= arr[indx];
            }
        }
        System.out.println(minval);
    }
}
