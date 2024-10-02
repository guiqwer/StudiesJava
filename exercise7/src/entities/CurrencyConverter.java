package entities;

public class CurrencyConverter {
    public double dollarPrice;
    public double dollarBuy;

    public double valueReais() {
        return dollarBuy * dollarPrice;
    }
}
