import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate data04 = LocalDate.parse("2024-10-07");
        LocalDateTime data05 = LocalDateTime.parse("2024-10-08T13:59:10");
        Instant data06 = Instant.parse("2024-10-07T13:59:10Z");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        //Especificar qual fuso horario do computador do usuario
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        //LOCAL
        DateTimeFormatter formatter3 = DateTimeFormatter.ISO_DATE_TIME;
        //Global
        DateTimeFormatter formatter4 = DateTimeFormatter.ISO_INSTANT;

        System.out.println(data04.format(formatter));
        //ou
        System.out.println(formatter.format(data05));

        System.out.println(data05.format(formatter));
        //ou
        System.out.println(data05.format(formatter1));

        System.out.println(formatter3.format(data05));

        System.out.println(formatter4.format(data06));



    }
}