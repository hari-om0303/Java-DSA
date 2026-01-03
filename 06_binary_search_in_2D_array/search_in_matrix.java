import java.util.Arrays;

public class search_in_matrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(searchmatrix(mat, 8)));
    }
    static int [] searchmatrix(int [][]mat , int targ){
        int r = 0;
        int c = mat.length-1;

        while (r< mat.length && c>=0){
            if (mat[r][c] == targ){
                return new int []{r,c};
            }
            if (mat[r][c] < targ){
                r++;
            }else {
                c--;
            }
        }
        return new int [] {-1,-1};
    }
}
