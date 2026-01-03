public class LeafStarPattern {
    public static void main(String[] args) {
       star(4);
    }
    static void star(int n){
        for (int i=0; i<=2*n; i++){
            int TotalColInRow = i>n ? 2*n-i : i;
            int NoOfSpace = n-TotalColInRow;
            for (int s=0; s<=NoOfSpace; s++){
                System.out.print(" ");
            }
            for (int j=0; j<=TotalColInRow; j++){
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}
