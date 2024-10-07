import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDate data04 = LocalDate.parse("2024-10-07");
        LocalDateTime data05 = LocalDateTime.parse("2024-10-08T13:59:10");
        Instant data06 = Instant.parse("2024-10-07T13:59:10Z");
    }
}