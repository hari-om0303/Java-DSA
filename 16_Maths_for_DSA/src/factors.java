public class factors {
    public static void main(String[] args) {
//        fctr1(20);
        fctr2(20);
    }
//    time complexity = o(n)
    static void fctr1(int n){
        for (int i=1; i<=n; i++){
            if (n%i==0){
                System.out.print(i + " ");
            }
        }
    }

//    time complexity = o(sqrt(n))
static void fctr2(int n){
    for (int i=1; i<=Math.sqrt(n); i++){
        if (n%i==0){
            if (n/i==i){
            System.out.print(i + " ");
            }else {
                System.out.print(i + " " + n/i + " ");
            }
        }
    }
}
}
