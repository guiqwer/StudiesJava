package application;

import entities.Product;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();

        set.add(new Product("Apple", 1.99));
        set.add(new Product("Banana", 2.99));
        set.add(new Product("Orange", 3.99));

        Product prod = new Product("Apple", 1.99);

        //se não tiver o hash e equals na minha classe ele vai comparar por referência
        System.out.println(set.contains(prod));
    }
}
