import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b){
            System.out.println("a is large : " + a);
        }
        else if(b>c){
            System.out.println("b is large : " + b);
        }
        else {
            System.out.println("c is large : " + c);
        }

//        2nd method
        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
    }
}
