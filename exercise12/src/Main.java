import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = sc.nextInt();

        double[] vector = new double[n];

        // popular vetor
        double sum = 0;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Digite um número:");
            vector[i] = sc.nextDouble();
            sum += vector[i];
        }

        // exibir valor
        System.out.println("Valores: ");
        for (int i = 0; i < vector.length; i++) {

            System.out.printf("%.1f ", vector[i]);
        }

        System.out.println();

        double average = sum / n;

        System.out.printf("Soma = %.2f\n", sum);
        System.out.printf("Media = %.2f", average);

        sc.close();


    }
}