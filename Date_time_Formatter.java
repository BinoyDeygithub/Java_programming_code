package Java_projects;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_time_Formatter {
    public static void main(String[] args) {
        LocalDateTime dt= LocalDateTime.now(); // this is a date

        System.out.println(dt);
     //   Date_time_Formatter dtf=Date_time_Formatter.ofPattern;
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yy||--E a");
        DateTimeFormatter dtf1=DateTimeFormatter.ISO_DATE;
        String MyDate= dt.format(dtf); //creating date string using date or format
        System.out.println(MyDate);
    }
}
