import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate data04 = LocalDate.parse("2022-07-20");
        LocalDateTime data05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant data06 = Instant.parse("2022-07-20T01:30:26Z");


        LocalDate pastWeekLocalDate = data04.minusDays(7);
        System.out.println("Semana passada " + pastWeekLocalDate);
        LocalDate nextWeekLocalDate = data04.plusDays(7);
        System.out.println("Semana que vem " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = data05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = data05.plusDays(7);

        System.out.println("Semana passada " + pastWeekLocalDateTime);
        System.out.println("Semana que vem " + nextWeekLocalDateTime);

        Instant pastWeekInstant = data06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = data06.plus(7, ChronoUnit.DAYS);

        System.out.println("Semana passada " + pastWeekInstant);
        System.out.println("Semana que vem " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), nextWeekLocalDate.atStartOfDay());
        //Duration t2 = Duration.between(pastWeekLocalDate, data05);
        Duration t3 = Duration.between(pastWeekInstant, data06);
        Duration t4 = Duration.between(data06, pastWeekInstant);

        System.out.println(t1.toDays());
        //System.out.println(t2);
        System.out.println(t3.toDays());
        System.out.println(t4.toDays());
    }
}