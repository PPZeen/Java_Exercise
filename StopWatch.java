import java.util.GregorianCalendar;
import java.util.Calendar;

public class StopWatch {
    GregorianCalendar gc = new GregorianCalendar();
    long startTime = gc.getTimeInMillis();
    long endTime = gc.getTimeInMillis();

    StopWatch(){}

    public void start()
    {
        gc = new GregorianCalendar();
        startTime = gc.getTimeInMillis();
    }
    public void stop()
    {
        gc = new GregorianCalendar();
        endTime = gc.getTimeInMillis();
    }
    public long getElapsedTime()
    {
        return endTime - startTime;
    }
}
