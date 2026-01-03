public class reverse_nnumber {
    public static void main(String[] args) {
        int n = 23434;
        int new_n = 0;

        while(n>0){
            int rem = n%10;
            new_n = new_n*10 + rem;
            n = n/10;
        }
        System.out.println(new_n);
    }
}
