package application;

import entities.Product;


import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Set<Product> set = new TreeSet<>();

        set.add(new Product("Apple", 1.99));
        set.add(new Product("Banana", 2.99));
        set.add(new Product("Orange", 3.99));

        //Quando uso o treeset preciso fazer a implementação do comparable
        for (Product product : set) {
            System.out.println(product);
        }
    }
}
