package model.entities;

import model.entities.exception.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){

    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) {
        validateWithdraw(amount);
        this.balance -= amount;
    }

    public void validateWithdraw(Double amount) {
        if (amount > getWithdrawLimit()) {
            throw new DomainException("Amount exceeded withdraw limit");
        }
        if (amount < 0) {
            throw new DomainException("Amount is negative");
        }
        if (amount > getBalance()) {
            throw new DomainException("Amount exceeded balance");
        }
    }

}
