package Java_projects;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class apitime {
    public static void main(String[] args) {
        LocalDate d= LocalDate.now();
        System.out.println(d);
        LocalTime t=LocalTime.now();
        System.out.println(t);
        LocalDateTime c=LocalDateTime.now();
        System.out.println(c);
    }
}
