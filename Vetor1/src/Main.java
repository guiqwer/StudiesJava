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

        double[] vect = new double[n];
        //populando array
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }

        double media = soma / n;


        System.out.println("Media = " + media);

        sc.close();
    }
}