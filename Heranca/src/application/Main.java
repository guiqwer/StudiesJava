package application;


import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1001, "ALex Green", 0.0);
        Account acc1 = new Account(1001, "Alex", 1000.0);

        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());

        //BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        //Upcasting
        /*
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "John Smith", 0.0, 500.00);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 500.00);

        //Downcasting
        //Superclasse para subclasse

        //Account para bussiness não é possivel, pra isso precisamos fazer o casting
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //Só vai dar problema na hora da execução.
        //BusinessAccount acc5 = (BusinessAccount) acc3;

        //testar se meu acc3 é um BusinessAccount
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
        */
    }
}