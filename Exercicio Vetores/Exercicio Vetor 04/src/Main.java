import java.util.Locale;
import java.util.Scanner;

// Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos números você vai digitar: ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Números Pares: ");
        int quantidadePares = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                quantidadePares++;
                System.out.println(vetor[i]);
            }
        }

        System.out.println("Quantidade de Pares: " + quantidadePares);
    }
}