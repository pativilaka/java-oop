package application;

import entities.Client;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented?How many rooms will be rented? ");
        int n = sc.nextInt();

        Client[] clients = new Client[10];

        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Rent #" + (i+1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            clients[room] = new Client(name, email, room);
            System.out.println();
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < clients.length; i++){
            if (clients[i] != null) {
                System.out.println(clients[i]);
            }
        }


        sc.close();

    }
}