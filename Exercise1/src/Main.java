import java.util.Locale;

//First Exercise

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is %.2f\n", product1, price1);
        System.out.printf("%s, which price is %.2f\n", product2, price2);

        System.out.printf("Records %d years old, code %d and gender: %c\n", age, code, gender);

        System.out.printf("Measue with eigth decimal places %.8f\n", measure);
        System.out.printf("Rouded (Three decimal places) %.3f", measure);

    }
}