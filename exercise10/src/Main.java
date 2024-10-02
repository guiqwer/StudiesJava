import entities.Product;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Digite um número: ");
        n = sc.nextInt();

        //instanciar vetor: tipo[] nome = new tipo dos elementos do array[TAM]
        Product[] vect = new Product[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / n;

        System.out.printf("Avg =  %.2f%n", avg);
        sc.close();
    }
}