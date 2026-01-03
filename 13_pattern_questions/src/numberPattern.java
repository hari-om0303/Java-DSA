public class numberPattern {
    public static void main(String[] args) {
star(4);
    }
    static void star(int n){
        for (int i=0; i<=n; i++){
            for (int s = 0; s<=n-i; s++){
                System.out.print("  ");
            }
            for (int j=i; j>=0; j--){
                System.out.print(j + " ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ") ;
        }
    }
}
