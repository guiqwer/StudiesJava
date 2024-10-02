import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas?");
        int n = sc.nextInt();

        Pessoas[] pessoas = new Pessoas[n];

        //populando vetor
        for (int i = 0; i < pessoas.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %d° pessoa\n", i + 1);
            System.out.println("Nome:");
            String nome = sc.nextLine();
            System.out.println("Idade:");
            int idade = sc.nextInt();
            System.out.println("Altura:");
            double altura = sc.nextDouble();
            pessoas[i] = new Pessoas(nome, idade, altura);
        }

        double somaAltura = 0;
        int quantidadeMenor16 = 0;
        for (int i = 0; i < pessoas.length; i++) {
            somaAltura += pessoas[i].getAltura();

            if (pessoas[i].getIdade() < 16) {
                quantidadeMenor16++;
            }
        }

        double media = somaAltura / n;
        System.out.println("Media: " + media);

        double porcentagemMenor16 = (double) quantidadeMenor16 / n * 100;
        System.out.printf("Pesosas com idade menor que 16: %.2f%%\n", porcentagemMenor16);
        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
            }
        }

        sc.close();
    }
}