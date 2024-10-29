package application;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //pedindo o diretorio
        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        //acessar o arquivo em si
        System.out.println("getName: " + path.getName()); // pega o nome do arquivo
        //pegar somente o caminho
        System.out.println("getParent: " + path.getParent());
        //mesma coisa so que o caminho completo
        System.out.println("getAbsolutePath: " + path.getAbsolutePath());



        sc.close();
    }
}
