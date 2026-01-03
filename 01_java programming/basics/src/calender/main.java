package calender;

import java.util.Calendar;

public class main {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println("calender type : "+ c.getCalendarType());
        System.out.println("current year is : " + c.get(Calendar.YEAR));
        System.out.println("current month  is : " + c.get(Calendar.MONTH));
        System.out.println("current day is : " + c.get(Calendar.DAY_OF_YEAR));

        c.add(Calendar.YEAR , 5);
        System.out.println("after 5 years" +  c.getTime());

        c.add(Calendar.YEAR , -5);
        System.out.println("before 5 years" +  c.getTime());
    }
}
