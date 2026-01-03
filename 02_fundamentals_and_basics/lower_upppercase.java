import java.util.Scanner;

public class lower_upppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your sentence : ");
        char ch = sc.next().trim().charAt(5);

        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");
        }
    }
}
