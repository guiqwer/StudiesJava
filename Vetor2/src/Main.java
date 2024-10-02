import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int n = sc.nextInt();


        //produtos = tipo do vetor (minha classe)

        Produtos[] vetor = new Produtos[n];

        //populando vetor
        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vetor[i] = new Produtos(nome, preco);
        }

        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i].getPreco(); //pra pegar o valor do produto.
        }

        double media = soma / vetor.length;

        System.out.printf("Media dos produtos: %.2f", media);


        sc.close();
    }
}