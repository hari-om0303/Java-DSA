public class n_to_one {
    public static void main(String[] args) {
        number(5);
        no(5);
    }
//    first method
    static void number(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        number(n-1);
    }

    //    second method
    static void no(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        no(--n);
    }
}
