public class GCD_LCM {
    public static void main(String[] args) {
        int a=4,  b =6;

        int gcdval = gcd(a,b);
        int lcmval = lcm(a,b);

        System.out.println("GCD " + gcdval);
        System.out.println("LCM " + lcmval);
    }
    static int gcd(int a ,int b){
        if (a==0){
            return b;
        }
        return gcd(b % a, a);
    }
    static int lcm(int a , int b){
        return a*b/gcd(a,b);
    }
}
