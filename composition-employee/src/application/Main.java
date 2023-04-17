package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.sql.SQLOutput;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String nomeDep = sc.nextLine();

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        System.out.print("Base salary: ");
        Double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(nomeDep));
        HourContract contract;

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Enter contract #" + (i+1) + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            String date = sc.next();
            LocalDate dataContrato = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Value per hour: ");
            Double valueHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            Integer hours = sc.nextInt();

            contract = new HourContract(dataContrato, valueHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department:  " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(month, year)));

        sc.close();

    }
}