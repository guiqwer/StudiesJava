package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        List<Product> listProducts = new ArrayList<>();

        listProducts.add(new Product("Tv",900.00));
        listProducts.add(new Product("Mouse", 50.00));
        listProducts.add(new Product("Tablet", 350.00));
        listProducts.add(new Product("HD Case", 80.90));

        //expressao lambada inline
        //listProducts.removeIf(product -> product.getPrice() > 100.00);

        //listProducts.removeIf(new ProductPredicate());
        //referencia para metodo -> classe onde o metodo ta :: nome do metodo

        //listProducts.removeIf(Product::nonStaticProductPredicate);
        //Expressao lambada declarada
        Predicate<Product> pred = p -> p.getPrice() > 100.00;

        for (Product product : listProducts){
            System.out.println(product);
        }
    }
}
