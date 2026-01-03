public class StarPattern {
    public static void main(String[] args) {
        star(4);
    }
    static void star(int n){
        for (int i=0; i<=2*n; i++){
            int TotalColInRow = i>n ? 2*n-i : i ;
            for (int j=0; j<=TotalColInRow; j++){
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}
