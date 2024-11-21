package application;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {
        List<Product> listProducts = new ArrayList<>();

        listProducts.add(new Product("Tv",900.00));
        listProducts.add(new Product("Mouse", 50.00));
        listProducts.add(new Product("Tablet", 350.00));
        listProducts.add(new Product("HD Case", 80.90));

        //listProducts.forEach(Product::attValue);
        //outro jeito de printar
        //listProducts.forEach(System.out::println);

        //lambada declarada
        //Consumer<Product> product  = p -> p.setPrice(p.getPrice() * 1.1);
        //listProducts.forEach(System.out::println);

        //lambada inline
        listProducts.forEach(product -> product.setPrice(product.getPrice() * 1.1));
        listProducts.forEach(System.out::println);

    }
}
