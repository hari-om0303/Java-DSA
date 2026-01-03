public class MaxValue {
    public static void main(String[] args) {
        int [][] arr = {{12,232,21},
                {45,23,65},
                {34,5,56,3400}};
        System.out.println(Max(arr));
    }
    static int Max(int [][] arr){
        int maxval = arr[0][0];
        for (int r=0; r< arr.length; r++){
            for (int c=0; c< arr[r].length; c++){
                if (arr[r][c]>maxval){
                    maxval = arr[r][c];
                }
            }
        }
                    return maxval;
    }
}
