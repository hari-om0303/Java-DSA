public class NoSquarePattern {
    public static void main(String[] args) {
        starr(3);
    }
    static void starr(int n){
        int original = n;
        n = 2*n;
        for (int i=0 ; i<=n ; i++){
            for (int j=0; j<=n; j++){
                int atEvryind = Math.min(Math.min(i,j), Math.min(n-i,n-j));
                System.out.print(atEvryind + " ");
            }
            System.out.println();
        }
    }
}
