import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        //Data-hora +/- tempo ➞ Data-hora
        LocalDate d01 = LocalDate.parse("2023-04-14");
        LocalDateTime d02 = LocalDateTime.parse("2023-04-14T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:56Z");

        LocalDate lastWeek = d01.minusDays(7);
        LocalDate nextWeek = d01.plusDays(7);
        System.out.println(lastWeek + " " + nextWeek);

        LocalDateTime lastWeekTime = d02.minusDays(7);
        LocalDateTime nextWeekTime = d02.plusDays(7);
        System.out.println(lastWeekTime + " " + nextWeekTime);

        Instant lastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstat = d03.plus(7, ChronoUnit.DAYS);
        System.out.println(lastWeekInstant + " " + nextWeekInstat);

        //Data-hora 1, Data-hora 2 ➞ Duração
        Duration t1 = Duration.between(lastWeekTime, nextWeekTime);
        Duration t2 = Duration.between(nextWeekTime, lastWeekTime);
        System.out.println(t1.toDays());
        System.out.println(t2.toDays());

        //LocalDate não compila duração, temos que tranformar em LocalDateTime
        Duration t3 = Duration.between(lastWeek.atTime(0,0), nextWeek.atTime(0,0));
        Duration t4 = Duration.between(nextWeek.atStartOfDay(), lastWeek.atStartOfDay());
        System.out.println(t3.toDays());
        System.out.println(t4.toDays());

        Duration t5 = Duration.between(lastWeekInstant, nextWeekInstat);
        System.out.println(t5.toDays());


    }
}