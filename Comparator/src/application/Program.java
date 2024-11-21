package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Banana", 1.99));
        list.add(new Product("Apple", 2.99));
        list.add(new Product("Orange", 3.99));

        //Função anonima
        //Posso passar toda a operação lambda no meu sort
        //Comparator<Product> comp = (o1, o2) -> o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
        
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        list.sort(Comparator.comparing(o -> o.getName().toUpperCase()));

        for (Product product : list) {
            System.out.println(product);
        }
    }
}
