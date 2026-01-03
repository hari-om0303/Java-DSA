import java.util.Scanner;

public class fibonacchi_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter index : ");
        int n = sc.nextInt();
        int a = 0 ;
        int b = 1 ;

            System.out.println(a);
        System.out.println(b);
        for (int i=0 ; i<=n-2 ; i++){
            int temp = a+b;
             a = b;
             b = temp;
        System.out.println(temp);
        }
    }
}
