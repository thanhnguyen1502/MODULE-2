package caseStudy.controllers;

import java.util.Scanner;

public class PromotionController {
    private static Scanner sc = new Scanner(System.in);
    static void displayPromotionMenu(){
        int choice;
        do {
            System.out.println("--- PROMOTION MENU ---\n" +
                    "1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu\n");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    return;
                default:
                    System.out.println("không có, mời nhập lại");
            }
        }while (true);

    }
}
