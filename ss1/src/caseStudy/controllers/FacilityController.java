package caseStudy.controllers;

import java.util.Scanner;

public class FacilityController {
    private static Scanner sc = new Scanner(System.in);
    static void displayFacilityMenu(){
        int choice;
        do {
            System.out.println("--- FACILITY MENU ---\n" +
                    "1 Display list facility\n" +
                    "2 Add new facility\n" +
                    "3 Display list facility maintenance\n" +
                    "4 Return main menu");
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
