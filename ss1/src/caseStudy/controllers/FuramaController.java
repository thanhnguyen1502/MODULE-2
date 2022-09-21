package caseStudy.controllers;

import java.util.Scanner;

public class FuramaController {
    private static Scanner sc = new Scanner(System.in);
     public static void displayMainMenu(){
        int choice;
        do {
            System.out.println("--- FURAMA RESORT ---\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management \n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit\n");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    EmployeeController.displayEmployeeMenu();
                    break;
                case 2:
                    CustomerController.displayCustomerMenu();
                    break;
                case 3:
                    FacilityController.displayFacilityMenu();
                    break;
                case 4:
                    BookingController.displayBookingMenu();
                    break;
                case 5:
                    PromotionController.displayPromotionMenu();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("không có số này, mời bạn nhập lại !");
            }
        }while (true);
    }
}
