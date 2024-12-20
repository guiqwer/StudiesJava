package application;

import entities.ComboDevice;
import entities.ConcretePrinter;
import entities.ConcreteScanner;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My letter");
        p.print("My letter");

        System.out.println();

        ConcreteScanner s = new ConcreteScanner("2222");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());

        System.out.println();

        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + c.scan());
    }
}
