package application;

import entities.Client;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Client client;

        System.out.println("Enter account number: ");
        int numberAccount = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter account holder ");
        String accountHolder = sc.nextLine();

        System.out.println("Is there a initial deposit ? (y/n)");
        char response = sc.next().charAt(0);

        double initialDeposit;
        if (response == 'y') {
            System.out.println("Enter initial deposit amount: ");
            initialDeposit = sc.nextDouble();
             client = new Client(numberAccount, accountHolder, initialDeposit);
        } else {
             client = new Client(numberAccount, accountHolder);
        }

        System.out.println("Account Data: ");
        System.out.println(client);

        double deposit;
        System.out.println("Enter deposit value: ");
        deposit = sc.nextDouble();
        client.addAccountBalance(deposit);

        System.out.println("Updated account data: ");
        System.out.println(client);

        double withdraw;
        System.out.println("Enter a withdraw value: ");
        withdraw = sc.nextDouble();
        client.removeAccountBalance(withdraw);

        System.out.println("Updated account data: ");
        System.out.println(client);

        sc.close();
    }
}