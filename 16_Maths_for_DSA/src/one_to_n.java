public class one_to_n {
    public static void main(String[] args) {
//        number(5);
        no(5);
    }
//    first method
    static void number(int n){
        if (n==0){
            return;
        }
        number(n-1);
        System.out.println(n);
    }
//    second method
    static void no(int n){
        if (n==0){
            return;
        }
        no(--n);
        System.out.println(n);
    }
}

