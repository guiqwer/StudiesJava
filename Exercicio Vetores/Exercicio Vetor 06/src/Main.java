import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] vetor1 =new int[n];
        System.out.println("Digite os valores do vetor A");
        for (int i =0; i < vetor1.length; i++) {
            vetor1[i] = sc.nextInt();;
        }

        int[] vetor2 =new int[n];
        System.out.println("Digite os valores do vetor B");
        for (int i =0; i < vetor2.length; i++) {
            vetor2[i] = sc.nextInt();;
        }

        int[] vetorResultante = new int[n];
        System.out.println("Vetor Resultante");
        for (int i = 0; i < vetorResultante.length; i++) {
            vetorResultante[i] = vetor1[i] + vetor2[i];
            System.out.println(vetorResultante[i]);
        }

        sc.close();
    }
}