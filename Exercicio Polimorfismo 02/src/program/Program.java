package program;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char choice = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if (choice == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else if (choice == 'c') {
                System.out.print("Number of employees: ");
                int numOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numOfEmployees));
            } else {
                System.out.println("Invalid choice");
            }
        }

        double sum = 0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer t : list) {
            System.out.println(t.getName()+": $ " + t.tax());
            sum += t.tax();
        }

        System.out.println();
        System.out.print("TOTAL TAXES: $ " + sum);
    }
}
