import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] vetor  = new int[n];

        //Populando vetor
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número:");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Números negativos: ");
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}