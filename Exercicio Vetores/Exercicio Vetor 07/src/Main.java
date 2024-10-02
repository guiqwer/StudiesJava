import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor ?");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        double soma = 0;
        int npares = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                npares++;
            }
        }

        double media;
        if (npares == 0){
            System.out.println("Nenhum número par");
        } else {
            media = (double) soma / npares;
            System.out.printf("MEDIA DOS PARES = %.1f\n", media);
        }


        sc.close();
    }
}