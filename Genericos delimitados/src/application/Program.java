package application;

import entities.Product;
import services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();

        String path = "C:\\Users\\guilh\\IdeaProjects\\in02.txt";

        //ler meu arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] data = line.split(",");
                list.add(new Product(data[0], Double.parseDouble(data[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most Expensive Product: :");
            System.out.println(x);
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
