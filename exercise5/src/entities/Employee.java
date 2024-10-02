package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;


    public double NetSalary(){
        return grossSalary - tax;
    }

    public void increseSalary(double percentage){
        grossSalary += grossSalary * percentage / 100;
    }

    public String toString(){
        return "Updated data :" + name + "," + NetSalary();
    }
}
