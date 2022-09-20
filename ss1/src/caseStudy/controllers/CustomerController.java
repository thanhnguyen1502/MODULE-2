package caseStudy.controllers;

import java.util.Scanner;

public class CustomerController {
    private static Scanner sc = new Scanner(System.in);
    static void displayCustomerMenu(){
        int choice;
        do {
            System.out.println("--- CUSTOMER MENU ---\n" +
                    "1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu");
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
