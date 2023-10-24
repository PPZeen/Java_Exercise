import java.util.GregorianCalendar;
import java.util.Calendar;

public class Lab_4_2 {
    public static void main(String args[])
    {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is " + gc.get(Calendar.YEAR));
        System.out.println("Month is " + gc.get(Calendar.MONTH));
        System.out.println("Date is " + gc.get(Calendar.DATE));
        System.out.println("Date of week is " + gc.get(Calendar.DAY_OF_WEEK));
        System.out.println("------------");

        gc.setTimeInMillis(gc.getTimeInMillis() + 24*60*60*1000);
        
        System.out.println("After specified the elapsed time of one day after current day");
        System.out.println("Year is " + gc.get(Calendar.YEAR));
        System.out.println("Month is " + gc.get(Calendar.MONTH));
        System.out.println("Date is " + gc.get(Calendar.DATE));
        System.out.println("Date of week is " + gc.get(Calendar.DAY_OF_WEEK));
        System.out.println(gc.getTime());
    }
}