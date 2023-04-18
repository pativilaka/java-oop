package application;

import entities.*;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(sc.next(), fm);

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        LocalDateTime date = LocalDateTime.now();
        Order order = new Order(date, status, client);

        System.out.print("How many items to this order? ");

        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Enter #" + (i+1) + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price:  ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, price);
            OrderItem oi = new OrderItem(quantity, price, product);
            order.addItem(oi);
        }


        System.out.println();
        System.out.println(order);

        sc.close();

    }
}