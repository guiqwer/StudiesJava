import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Definindo como padrão
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); // hora de 0-23/min/seg

        // Apenas data
        LocalDate data = LocalDate.now();
        // Com o tempo
        LocalDateTime data02 = LocalDateTime.now();
        // Data hora GMT/Global
        Instant data03 = Instant.now();
        // Formato ISO
        LocalDate data04 = LocalDate.parse("2024-10-07");
        LocalDateTime data05 = LocalDateTime.parse("2024-10-08T13:59:10");
        Instant data06 = Instant.parse("2024-10-07T13:59:10Z");
        Instant data07 = Instant.parse("2024-10-07T13:59:10-03:00");

        LocalDate data08 = LocalDate.parse("07/10/2024", formatter);
        // ou
        LocalDate data09 = LocalDate.parse("07/10/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        //--------------------------------------------------------------------------------------------------
        LocalDateTime data10 = LocalDateTime.parse("07/10/2024 15:00:00", formatter1); //
        // ou
        LocalDateTime data11 = LocalDateTime.parse("07/10/2024 15:00:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        //--------------------------------------------------------------------------------------------------

        LocalDate data12 = LocalDate.of(2024, 10, 7);

        // outro padrão of
        LocalDateTime data13 = LocalDateTime.of(2024, 10, 7, 1, 45, 25);

        System.out.println(data);
        System.out.println(data02);
        System.out.println(data03);
        System.out.println(data04);
        System.out.println(data05);
        System.out.println(data06);
        System.out.println(data07);
        System.out.println(data08);
        System.out.println(data09);
        System.out.println(data10);
        System.out.println(data11);
        System.out.println(data12);
        System.out.println(data13);
    }
}
