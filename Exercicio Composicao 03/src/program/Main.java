package program;

import entities.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();
        LocalDate date = LocalDate.parse(birthDate, dtf);
        Client client = new Client(name, email, date);

        System.out.println("Enter order data");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());
        Order order = new Order(LocalDateTime.now(), status, client);

        System.out.println("How many items to this order? ");
        int items = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= items; i++) {
            System.out.println("Enter #" + i + " item data: ");
            System.out.println("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(productName, price);

            OrderItem it = new OrderItem(quantity, price, product);

            order.addItem(it);

        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}