import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        int maior = vetor[0];
        int maiorPosicao = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();

            if (vetor[i] > maior) {
                maior = vetor[i];
                maiorPosicao = i;
            }
        }

        System.out.println("Maior valor = " + maior);
        System.out.println("Posição do maior valor " + maiorPosicao);
        sc.close();
    }
}