package DATE_AND_TIME;

import java.util.Date;

public class date extends Thread{
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("current date is : " + d);

        Date d1 = new Date(1723097844);
        System.out.println("date calc. from millis " + d1);

        System.out.println("years = "+d1.getYear());
        System.out.println("current date = " + d1.getDate());
    }
}
