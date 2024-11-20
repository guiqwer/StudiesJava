package application;

import entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        // positivo caso o1 > o2
        // 0 caso o1 == o2
        // negativo caso o1 < o2
        return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
    }
}
