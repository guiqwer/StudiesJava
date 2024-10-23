package program;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //não consigo instanciar com o account pq ele é abstrata

        //tipo generico
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1003, "John", 300.0, 0.01));
        list.add(new BusinessAccount(1004, "Anna", 500.0, 500.0));


        double sum = 0.0;
        for (Account acc : list){
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f", sum);

        for (Account acc : list){
            acc.deposit(10.0);
        }

        System.out.println();

        for (Account acc : list){
            System.out.printf("Update balance for account %d: %.2f\n", acc.getNumber(), acc.getBalance());
        }


    }
}