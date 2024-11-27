package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Employee> listEmployee = new ArrayList<>();

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                listEmployee.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            //Filtrando com lambda
            List<String> emails = listEmployee.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(Employee::getEmail)
                    .sorted()
                    .toList();

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ": ");
            emails.forEach(System.out::println);

            double sum = listEmployee.stream()
                    .filter(e -> e.getName().charAt(0) == 'M')
                    //como é so pra pegar vou usar refference method
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);

            System.out.println("Sun of salary from people whose name start with 'M " + String.format("%.2f", sum));
        }
        catch(IOException e){
            System.out.print("Error: " + e.getMessage());
        }
        sc.close();
    }
}
