import java.math.BigInteger;
import java.text.DecimalFormat;

public class LargeNumber {

    public static BigInteger factorial(int n){
        BigInteger ans = new BigInteger("1");
        for (int i=2 ; i <= n ; i++ ){
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }

    public static void main(String[] args) {
        BigInteger b = BigInteger.valueOf(8); // convert int/long to BI
        int c = b.intValue(); // convert  BI to int
//        System.out.println(b);
//        System.out.println(c);

        BigInteger BI1 = new BigInteger("32435324543");
        BigInteger BI2 = new BigInteger("32435324543");
        BigInteger add = BI1.add(BI2);
        BigInteger sub = BI1.subtract(BI2);
        BigInteger mul = BI1.multiply(BI2);
        BigInteger div = BI1.divide(BI2);
//        System.out.println(add);
//        System.out.println(sub);
//        System.out.println(mul);
//        System.out.println(div);

        System.out.println(factorial(342));

//        rounding off
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(34));
    }


}
