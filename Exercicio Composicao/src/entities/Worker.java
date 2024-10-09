package entities;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Deparment deparment;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker (){

    }

    public Worker(String name, Deparment deparment, Double salary, WorkerLevel level) {
        this.name = name;
        this.deparment = deparment;
        this.baseSalary = salary;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getSalary() {
        return baseSalary;
    }

    public void setSalary(Double salary) {
        this.baseSalary = salary;
    }

    public Deparment getDeparment() {
        return deparment;
    }

    public void setDeparment(Deparment deparment) {
        this.deparment = deparment;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    //Adicionar na lista o contrato que veio via argumento
    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public Double income(Integer year, Integer month) {
        double sum = baseSalary;

        for (HourContract c: contracts) {
            LocalDate contractDate = c.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int c_year = contractDate.getYear();
            int c_month = contractDate.getMonthValue();

            if (c_year == year && c_month == month) {
                sum+= c.totalValue();
            }
        }

        return sum;
    }
}
