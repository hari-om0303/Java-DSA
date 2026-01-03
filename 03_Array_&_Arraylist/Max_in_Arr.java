public class Max_in_Arr {
    public static void main(String[] args) {
        int [] arr = {23,45,432,34,342,5};
        System.out.println(max1(arr));
        max2(arr);
    }

    static int max1(int [] arr ){
        int maxval = arr[0];
        for (int i=0; i< arr.length; i++){
            if(arr[i]>maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }


    static void max2(int [] arr ){
        int maxval = arr[0];
        for (int i=0; i< arr.length; i++){
            if(arr[i]>maxval){
                maxval = arr[i];
            }
        }
        System.out.println(maxval);
    }

}
