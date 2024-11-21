package application;

import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Product> listProducts = new ArrayList<>();

        listProducts.add(new Product("Tv",900.00));
        listProducts.add(new Product("Mouse", 50.00));
        listProducts.add(new Product("Tablet", 350.00));
        listProducts.add(new Product("HD Case", 80.90));

        //função map é uma função que aplica uma função a todos elementos de uma stream
        //stream = sequencia de dados
        //transformandop lista em stream
        //Tenho que atribuir para uma nova Lista
        //List<String> names = listProducts.stream().map(Product::staticToUpperCase).toList();
        //Function<Product, String> namesUpperCase = product -> product.getName().toUpperCase();
        List<String> names = listProducts.stream().map(product -> product.getName().toUpperCase()).toList();


        names.forEach(System.out::println);
    }
}
