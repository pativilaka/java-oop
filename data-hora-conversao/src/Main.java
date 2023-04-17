import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-04-14");
        LocalDateTime d02 = LocalDateTime.parse("2023-04-14T14:50:06");
        Instant d03 = Instant.parse("2022-08-15T01:30:26Z");

        /*for ( String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }*/

        //Conversão global para local
        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        System.out.println(r1);
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        System.out.println(r2);

        System.out.println();

        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        System.out.println(r3);
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
        System.out.println(r4);

        System.out.println();
        //Obter dados de uma data hora local
        System.out.println("d01 dia = " + d01.getDayOfMonth());
        System.out.println("d01 mês = " + d01.getMonth());
        System.out.println("d01 mês = " + d01.getMonthValue());
        System.out.println("d01 ano = " + d01.getYear());

        System.out.println();
        System.out.println("d02 mês = " + d02.getHour());
        System.out.println("d02 mês = " + d02.getMinute());
        System.out.println("d02 mês = " + d02.getDayOfWeek());

    }
}