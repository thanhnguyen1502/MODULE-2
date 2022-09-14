package caseStudy.controllers;

import java.util.Scanner;

public class FuramaController {
    public  void displayMainMenu(){
        System.out.println(" MENU:\n" +
                "1. Employee Management\n" +
                "2. Customer Management\n" +
                "3. Facility Management\n" +
                "4. Booking Management\n" +
                "5. Promotion Management\n" +
                "6. Exit");
        do {

                Scanner scanner = new Scanner(System.in);
                String choose = scanner.nextLine();
            switch (choose){
                case "1":
                    EmployeeManagement();
                    break;
                case "2":
                    CustomerManagement();
                    break;
                    case "3":
                        FacilityManagement();
                    break;
                    case "4":
                        BookingManagement();
                    break;
                    case "5":
                        PromotionManagement();
                    break;
                    case "6":
                    return;
                default:
                    System.out.println("bạn nhập không đúng chức năng !");

            }
        } while (true);
    }
    private static void EmployeeManagement(){
        System.out.println("1 Display list employees\n" +
                "\n" +
                "2 Add new employee\n" +
                "3 Edit employee\n" +
                "4 Return main menu");
    }

    private static void CustomerManagement(){
        System.out.println("1. Display list customers\n" +
                "2. Add new customer\n" +
                "3. Edit customer\n" +
                "4. Return main menu");
    }

    private static void FacilityManagement(){
        System.out.println("1 Display list facility\n" +
                "2 Add new facility\n" +
                "3 Display list facility maintenance\n" +
                "4 Return main menu");
    }

    private static void BookingManagement(){
        System.out.println("1. Add new booking\n" +
                "2. Display list booking\n" +
                "3. Create new constracts\n" +
                "4. Display list contracts\n" +
                "5. Edit contracts\n" +
                "6. Return main menu");
    }

    private static void PromotionManagement(){
        System.out.println("1. Display list customers use service\n" +
                "2. Display list customers get voucher\n" +
                "3. Return main menu");
    }
}
