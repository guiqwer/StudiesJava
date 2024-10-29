package application;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //pedindo pro usuário digitar um caminho
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        //somente diretorio ou pasta
        //vetor de file com as pastas
        File[] folders = path.listFiles(File::isDirectory);
        //apenas arquivos
        File[] files = path.listFiles(File::isFile);

        //printar as pastas
        System.out.println("FOLDERS: ");
        for (File folder : folders){
            System.out.println(folder);
        }

        //printar arquivos
        System.out.println("FILES: ");
        for (File file : files){
            System.out.println(file);
        }

        //criar subpasta
        boolean success = new File(strPath + "\\teste").mkdir();
        
        System.out.println("Directory created successfully: " + success);
        sc.close();
    }
}
