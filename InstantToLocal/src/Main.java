import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate data04 = LocalDate.parse("2024-10-07");
        LocalDateTime data05 = LocalDateTime.parse("2024-10-08T13:59:10");
        Instant data06 = Instant.parse("2024-10-07T13:59:10Z");

        //Convertendo um instant(Global) para o horario do meu Sistema
        LocalDate r1 = LocalDate.ofInstant(data06, ZoneId.systemDefault());
        //Convertendo um Global para um local de acordo com o horario de portugal
        LocalDate r2 = LocalDate.ofInstant(data06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(data06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(data06, ZoneId.of("Portugal"));


        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        System.out.println(data04.getDayOfMonth());
    }
}