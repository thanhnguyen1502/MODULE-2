package caseStudy.controllers;

import java.util.Scanner;

public class BookingController {
    private static Scanner sc = new Scanner(System.in);
    static void displayBookingMenu(){
        int choice;
        do {
            System.out.println("--- BOOKING MENU ---\n" +
                    "1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new constracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    return;
                default:
                    System.out.println("không có, mời nhập lại");
            }
        }while (true);
    }
}
