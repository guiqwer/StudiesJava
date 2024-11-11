package entities;

import entities.service.Printer;
import entities.service.Scanner;

public class ConcretePrinter extends Device implements Printer {

    public ConcretePrinter(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc){
        System.out.println("Printer processing: " + doc);
    }


    @Override
    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}
