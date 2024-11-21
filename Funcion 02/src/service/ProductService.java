package service;

import entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double somaFiltrada(List<Product> products, Predicate<Product> criterio){
        double sum = 0;
        for(Product p : products){
            if (criterio.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
