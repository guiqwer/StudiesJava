import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("What is the dollar price?");
        converter.dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought ? ");
        converter.dollarBuy = sc.nextDouble();

        System.out.println("Amount to be paid in reais = " + converter.valueReais());


        sc.close();



    }
}