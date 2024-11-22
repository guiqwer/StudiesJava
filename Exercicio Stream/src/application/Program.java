package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter full file path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            List<Product> list = new ArrayList<>();

            while(line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            //mudar a lambda para um method refference
            //double avg = list.stream().map(p -> p.getPrice()).reduce(0.0, Double::sum);
            //Média do preço de todos meus produtos.
            double avg = list.stream().map(Product::getPrice).reduce(0.0, Double::sum) / list.size();

            System.out.println("Average price: " + String.format("%.2f", avg));

            Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            //refference method não aceita comparações
            List<String> names = list.stream()
                    .filter(product -> product.getPrice() < avg)
                    .map(Product::getName)
                    .sorted(comparator.reversed()).toList();

            names.forEach(System.out::println);
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
