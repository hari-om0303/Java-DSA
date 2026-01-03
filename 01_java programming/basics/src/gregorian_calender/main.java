package gregorian_calender;

import java.lang.management.GarbageCollectorMXBean;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class main {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();

        System.out.println(gc.isLeapYear(2024));
        System.out.println(gc.isLeapYear(2025));
        System.out.println("data before rolling " + gc.getTime());


        gc.roll(Calendar.MONTH,true); // move month forward by 1 (August → September)
        gc.roll(Calendar.DATE,false); // move date backward by 1 (6 → 5)
        gc.roll(Calendar.YEAR,true); // move year forward by 1 (2025 → 2026)
        System.out.println("data after rolling " + gc.getTime() );


        System.out.println("the hashcode for this for calender is: " + gc.hashCode());
        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.SECOND));
        System.out.println(gc.get(Calendar.HOUR));
        System.out.println(gc.get(Calendar.HOUR_OF_DAY)+ ":" + gc.get(Calendar.MINUTE) + ":" + gc.get(Calendar.SECOND));

    }
}
