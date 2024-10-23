package entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual(){
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax(){
        if (getAnualIncome() < 2000.00){
            return (getAnualIncome() * 15.0 / 100) - (50.0 * healthExpenditures / 100);
        } else {
            return (getAnualIncome() * 25.0 / 100) - (50.0 * healthExpenditures / 100);
        }
    }
}
