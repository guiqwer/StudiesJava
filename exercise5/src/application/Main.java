package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.println("Name: ");
        emp.name = sc.nextLine();

        System.out.println("Salary: ");
        emp.grossSalary = sc.nextDouble();

        System.out.println("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $%.2f\n", emp.name, emp.NetSalary());

        System.out.println("Which percentage to increse salary?");
        double percentage = sc.nextDouble();

        emp.increseSalary(percentage);

        System.out.println(emp.toString());

    }
}