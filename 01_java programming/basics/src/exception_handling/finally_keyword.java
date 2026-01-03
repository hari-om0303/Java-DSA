package exception_handling;

class keyword{
    public static int greet(){
       try{
           int a =10 ;
           int b = 5 ;
           int c = a/b;
           return c;
       }catch (Exception e){
           System.out.println(e);
       }finally {
           System.out.println("function greet ends here...");
       }
       return -1;
    }
}
public class finally_keyword {
    public static void main(String[] args) {
        int k = keyword.greet();
        System.out.println(k);

        int a = 6 ;
        int b = 3 ;
        while (true){
            try{
                System.out.println(a/b);
            }catch (Exception e){
                System.out.println(e);
                break;
            }finally {
                System.out.println("while loop " + b);
            }
            b--;
        }
    }
}
