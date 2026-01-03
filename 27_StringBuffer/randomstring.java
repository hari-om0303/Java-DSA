import java.util.Calendar;
import java.util.Random;

public class randomstring {

    public static String generator(int size){
        StringBuffer sb = new StringBuffer(size);
        Random rs = new Random();

        for (int i=0 ; i<= size ; i++){
            int ramchar = 97 + (int)(rs.nextFloat()*26);
            sb.append((char)ramchar);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        randomstring r = new randomstring();
          String randomstring= r.generator(700);
        System.out.println(randomstring);

    }
}
