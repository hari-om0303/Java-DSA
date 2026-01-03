public class Ispalingdrom {
    public static void main(String[] args) {
        System.out.println(ispaling(12321));
    }

    static boolean ispaling(int n){
        if (n == revrs(n,0)){
            return true;
        }
        return false;
    }

    static int revrs(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        return revrs(n / 10, sum);
    }
}
