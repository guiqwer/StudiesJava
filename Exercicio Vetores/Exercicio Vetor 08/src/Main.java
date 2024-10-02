import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar: ");
        int n = sc.nextInt();

        Pessoa[] vetor = new Pessoa[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Dados da %d° pessoa:\n", i + 1);
            sc.nextLine();
            System.out.println("Nome:" );
            String nome = sc.nextLine();
            System.out.println("Idade:" );
            int idade = sc.nextInt();
            vetor[i] = new Pessoa(nome, idade);
        }


        int maior = vetor[0].getIdade();
        String nomeMaior = vetor[0].getNome();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getIdade() > maior){
                maior = vetor[i].getIdade();
                nomeMaior = vetor[i].getNome();
            }
        }

        System.out.println("Pessoa mais velha: " + nomeMaior);

        sc.close();
    }
}