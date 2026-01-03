import java.math.BigDecimal;

public class bigdecimal {
    public static void main(String[] args) {
        double x = 0.04;
        double y = 0.03;
        System.out.println(x-y);

        BigDecimal X = new BigDecimal(0.04);
        BigDecimal Y = new BigDecimal(0.03);
        System.out.println(X.subtract(Y));

        BigDecimal a = new BigDecimal("2234221.23234234");
        BigDecimal b = new BigDecimal("22342.23134234");
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

        // constants
        BigDecimal con = BigDecimal.TEN;
        System.out.println(con);

    }
}
