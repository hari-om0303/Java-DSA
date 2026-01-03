import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.*;

public class time_question {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("HARI ");
        s.add("OM ");
        s.add("GUPTA");
        for (String str:s){
            System.out.print(str);
        }

        System.out.println(" ");

            Date d = new Date();
            System.out.println("time : " + d.getHours() +":"+d.getMinutes()+":"+d.getSeconds());


        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String time = dt.format(df);
        System.out.println("time: "+ time);


    }
}
