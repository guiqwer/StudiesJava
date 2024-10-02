import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        int contadorHomem = 0;
        for (int i = 0; i < pessoas.length; i++){
            sc.nextLine();
            System.out.printf("Altura da %d pessoa", i + 1);
            double altura = sc.nextDouble();

            System.out.printf("Gênero da %d pessoa", i + 1);
            char caracter = sc.next().charAt(0);
            if (caracter == 'M' || caracter == 'm') {
                contadorHomem++;
            }

            pessoas[i] = new Pessoa(altura, caracter);
        }

        double menor = pessoas[0].getAltura();
        double maior = pessoas[0].getAltura();
        double soma = 0;
        for (int i = 1; i < pessoas.length; i++){
            soma += pessoas[i].getAltura();

            if(pessoas[i].getAltura() > maior){
                maior = pessoas[i].getAltura();
            }

            if(pessoas[i].getAltura() < menor){
                menor = pessoas[i].getAltura();
            }
        }

        System.out.println("Menor altura : " + menor);
        System.out.println("Maior Altura : " + maior);

        System.out.println("Numero de homens: " + contadorHomem);

        sc.close();

    }
}