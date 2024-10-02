import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        int soma = 0;
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número");
            vetor[i] = sc.nextInt();
            soma+=vetor[i];
        }

        System.out.println("Valores:");
        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
        System.out.println("Soma: " + soma);

        // fazer casting
        double media = (double) soma/n;
        System.out.println("Media: " + media);

        sc.close();
    }
}