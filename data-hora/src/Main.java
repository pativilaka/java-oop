import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

        //Instanciação

        //Local
        LocalDate d01 = LocalDate.now();
        System.out.println(d01);

        LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02);

        //Global
        Instant d03 = Instant.now();
        System.out.println(d03);

        //Texto ISO 8601
        LocalDate d04 = LocalDate.parse("2023-04-14");
        System.out.println(d04);

        LocalDateTime d05 = LocalDateTime.parse("2023-04-14T13:19:25");
        System.out.println(d05);

        Instant d06 = Instant.parse("2023-04-14T13:19:25Z");
        System.out.println(d06);

        Instant d07 = Instant.parse("2023-04-14T13:19:25-03:00");
        System.out.println(d07);

        //Texto formato customizado
        DateTimeFormatter frm01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("14/04/2023", frm01);
        System.out.println(d08);

        DateTimeFormatter frm02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("14/04/2023 13:57", frm02);
        LocalDateTime d10 = LocalDateTime.parse("14/04/2023 13:57", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(d09);
        System.out.println(d10);

        LocalDate d11 = LocalDate.of(2020, 07, 15);
        System.out.println(d11);

        LocalDateTime d12 = LocalDateTime.of(2022, 12, 22, 14,50);
        System.out.println(d12);




    }
}