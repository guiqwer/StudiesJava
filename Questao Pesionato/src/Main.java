import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluguel[] vetor = new Aluguel[10];

        System.out.println("Quantos quartos vão ser alugados ?");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Quarto:");
            int quarto = sc.nextInt();
            vetor[quarto] = new Aluguel(nome, email);
        }

        System.out.println("Busy rooms");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] != null) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();

    }
}