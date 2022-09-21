package caseStudy.controllers;

import caseStudy.services.IEmployeeService;
import caseStudy.services.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    private static Scanner sc = new Scanner(System.in);
    private static IEmployeeService employeeService = new EmployeeService();
    static void displayEmployeeMenu(){
        int choice;
        do {
            System.out.println("--- EMPLOYEE MENU ---\n" +
                    "1 Display list employees\n" +
                    "2 Add new employee\n" +
                    "3 Edit employee\n" +
                    "4 Return main menu\n");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.add();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("không có, mời nhập lại");
            }
        }while (true);


    }
}
