package entities;

public class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company(){
        super();
    }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }


    @Override
    public Double tax(){
        if (numberOfEmployees > 10){
            return (getAnualIncome() * 14.0 / 100);
        } else {
            return (getAnualIncome() * 16.0 / 100);
        }
    }


}
