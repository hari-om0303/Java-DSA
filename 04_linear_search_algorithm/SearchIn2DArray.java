import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {{12,232,21},
                {45,23,65},
                {34,5,56,34}};
        int trg = 340;
        int [] ans = Search(arr,trg);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Search(int [][]arr, int trg){
        for (int r=0; r< arr.length; r++){
            for (int c=0; c< arr[r].length; c++){
                if (arr[r][c]==trg){
                    return new int [] {r,c};
                }
            }
        }
        return new int [] {-1,-1};
    }
}
