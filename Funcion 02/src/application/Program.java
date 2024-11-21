package application;

import entities.Product;
import service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> listProducts = new ArrayList<>();

        listProducts.add(new Product("Tv",900.00));
        listProducts.add(new Product("Mouse", 50.00));
        listProducts.add(new Product("Tablet", 350.00));
        listProducts.add(new Product("HD Case", 80.90));

        ProductService productService = new ProductService();

        double sum = productService.somaFiltrada(listProducts, p -> p.getName().charAt(0) == 'M');

        System.out.print("Sum = " + String.format("%.2f", sum));
    }
}
