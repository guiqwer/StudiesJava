package application;

import entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv", 900.00);
        Product p2 = new Product("Notebook", 1200.00);
        Product p3 = new Product("Tablet", 400.00);

        //seria a quantidade de stock
        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        //Sem o hash equals ele vai fazer por referencia e por referencia vai dar false
        //ja que sao objetos diferentes
        Product ps = new Product("Tv", 900.00);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}
