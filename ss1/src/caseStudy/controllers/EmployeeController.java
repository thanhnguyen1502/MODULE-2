package caseStudy.controllers;

import java.util.Scanner;

public class EmployeeController {
    private static Scanner sc = new Scanner(System.in);
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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return;
                default:
                    System.out.println("không có, mời nhập lại");
            }
        }while (true);


    }
}
