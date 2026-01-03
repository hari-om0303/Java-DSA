//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Prime_number {
    public static void main(String[] args) {
      int n = 15;
      for (int i=0; i<=n; i++){
          System.out.println(i + " " + prime(i));
      }
    }
    static boolean prime(int n){
        if (n<=1){
            return false;
        }
        int c = 2;
        while (c*c<= n){
            if (n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}

