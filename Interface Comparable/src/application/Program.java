package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        //Lista de funcionários
        List<Employee> employees = new ArrayList<>();
        //Caminho para o meu arquivo in.txt onde esta os nomes
        String path = "C:\\Users\\guilh\\IdeaProjects\\in.txt";

        //usar o bufferedReader pra ler os arquivos
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String employeeCsv = br.readLine();
            while(employeeCsv != null){
                String[] employeeData = employeeCsv.split(",");
                employees.add(new Employee(employeeData[0], Double.parseDouble(employeeData[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(employees);
            for (Employee employee : employees) {
                System.out.println(employee.getName() + ", " + employee.getSalary());
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
