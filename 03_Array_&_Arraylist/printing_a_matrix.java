public class printing_a_matrix {
    public static void main(String[] args) {
        int [][] arr =  {{12,2,34},
                        {23,34},
                        {34,65,56}};

        for (int i = 0 ; i<arr.length ; i++){
            for (int j=0; j< arr[i].length; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println(" ");
        }
    }
}
