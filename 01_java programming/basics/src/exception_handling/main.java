package exception_handling;

public class main {
    public static void main(String[] args) {
        int cb = 100000;
        int wb = 14000;
        try{
            if(cb<wb){
                throw new ArithmeticException("insufficient balance:");
            }else{
            cb = cb - wb;
            System.out.println("transaction successful");
            System.out.println("current balance is : " + cb);
        }}
        catch (ArithmeticException e1){
            System.out.println(e1.getMessage());
            System.out.println("current balance is " + cb);
        }
    }
}
