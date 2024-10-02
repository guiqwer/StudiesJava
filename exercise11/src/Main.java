import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? max 10.");
        int n = sc.nextInt();

        if (n > 10) {
            System.out.println("Digite um número válido.");
            return;
        }

        double[] numeros = new double[n];

        //popular vetor
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextDouble();
        }

        //mostrar os números

        System.out.println("NÚMEROS NEGATIVOS:");
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] < 0){
                System.out.printf("%.2f\n", numeros[i]);
            }
        }

        sc.close();
    }
}