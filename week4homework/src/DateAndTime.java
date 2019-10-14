import com.sun.org.apache.xml.internal.security.keys.content.MgmtData;
import sun.util.calendar.LocalGregorianCalendar;
import java.time.ZoneId;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.TimeZone;

public class DateAndTime {
    public static void main(String[] args){

        // inbuilt feature
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Current date and time is " +ldt);

         // another way --but fixed date and time
        LocalDateTime ldt1 = LocalDateTime.of(2019,Month.AUGUST,20,21,51);
        System.out.println(ldt1);


        // another way
        LocalDate dt = LocalDate.now(ZoneId.systemDefault());
        System.out.println(dt);
        LocalTime tm = LocalTime.now();
        System.out.println(tm);

        // another way
       // LocalDateTime ltd2 =  LocalDateTime.now(TimeZone.getTimeZone());
      //  System.out.println(ltd2);



    }

}
