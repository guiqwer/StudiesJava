package entities;

import entities.service.Printer;
import entities.service.Scanner;

public class ComboDevice extends Device implements Scanner, Printer {
    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Combo processing: " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Combo priting: " + doc);
    }

    @Override
    public String scan() {
        return "Combo scan result";
    }
}
