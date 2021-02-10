package functionalInterfaces.javaTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        ZoneId of = ZoneId.of("Asia/Yerevan");
        ZoneId ofMoscow = ZoneId.of("Europe/Moscow");
        LocalDateTime dateErevan = LocalDateTime.now(of);
        LocalDateTime dateMoscow = LocalDateTime.now(ofMoscow);
        System.out.println(ChronoUnit.MINUTES.between(dateMoscow,dateErevan));
        System.out.println(dateErevan.getDayOfWeek());
        System.out.println(dateErevan.getMonth());
        System.out.println(dateErevan.getYear());

    }
}
