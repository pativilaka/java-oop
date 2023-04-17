package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String department = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        System.out.print("Base salary: ");
        Double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        HourContract contract;

        for (int i = 0; i < n; i++){
            System.out.println("Enter contract #" + (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            String date = sc.next();
            LocalDate dateContract = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Value per hour: ");
            Double valueHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            Integer hour = sc.nextInt();

            contract = new HourContract(dateContract, valueHour, hour);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String dateSearch = sc.next();
        Integer month = Integer.parseInt(dateSearch.substring(0, 2));
        Integer year = Integer.parseInt(dateSearch.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + dateSearch + ": " + String.format("%.2f", worker.income(month, year)));

        sc.close();
    }
}