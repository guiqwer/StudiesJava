import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Random rand = new Random();

        System.out.print("Digite um número para a matriz quadrada: ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        int contadorNegativo = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matriz[i][j] = rand.nextInt(-100, 101)  ;
                if (matriz[i][j] < 0){
                    contadorNegativo++;
                }
            }
        }


        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Diagonal Principal");

        for (int i = 0 ; i < n; i++){
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();
        
        System.out.println("Valores Negativos: " + contadorNegativo);

        sc.close();
    }
}