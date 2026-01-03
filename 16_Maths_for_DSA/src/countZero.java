public class countZero {
    public static void main(String[] args) {
        System.out.println(Count(3030400,0));
    }
    static int Count(int n ,int count){
        if (n==0){
            return count;
        }
        int rem= n%10;
        if (rem == 0){
            return   Count(n/10, count+1);
        }
      return   Count(n/10, count);
    }

}
