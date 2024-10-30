package application;

import model.entities.Product;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<Product>();

        //Caminho para o arquivo
        System.out.println("Enter file path: ");
        String path = sc.nextLine();

        File sourceFile = new File(path);
        //pegar o caminho direto
        String sourceFolderStr = sourceFile.getParent();

        //criar a pasta de acordo com o caminho passado
        boolean success = new File(sourceFolderStr + "\\out").mkdirs();

        String targetFileStr = sourceFolderStr + "\\out.txt";

        //vai tentar ler o arquivo que estamos passando
        try(BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            //ler a linha
            String itenTxt = br.readLine();
            //enquanto não for null ele vai continuar lendo
            while(itenTxt != null){
                //Separando as informações por virgula e colocando em um array
                String[] fields = itenTxt.split(",");
                String name = fields[0];
                //split retorna uma string logo preciso converter pra double
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);
                //pegando os dados da array e passando pra variavel fixa e dps adicionando no construtor.
                list.add(new Product(name, price, quantity));
                //repete o processo ate todos os itens forem alocados na lista.
                itenTxt = br.readLine();
            }

            //escrever os itens no out
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                //para cada item na minha lista
                for (Product item: list) {
                    bw.write(item.toString());
                    bw.newLine();
                }
                //confirmação que o arquivo foi criado.
                System.out.println(targetFileStr + "CREATED.");
            }
            catch(IOException e){
                System.out.println("Error writing to file: " + e.getMessage());
            }
        }
        catch (IOException e){
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
