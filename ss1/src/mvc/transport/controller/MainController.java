package mvc.transport.controller;

import java.util.Scanner;

public class MainController {
    public static Scanner sc = new Scanner(System.in);

    public static void displayMainMenu() {
        int choice;
        do {
            System.out.println(" CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG\n" +
                    "Chọn chức năng:\n" +
                    "1. Thêm mới phương tiện\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Tìm kiếm theo biển kiểm soát\n" +
                    "5. Thoát\n");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    AddTransport.add();
                    break;
                case 2:
                    DisplayTransport.display();
                    break;
                case 3:
                    RemoteTransport.remote();
                    break;
                case 4:
                    SearchTransport.search();
                case 5:
                    System.exit(0);
                    continue;
                default:
                    System.out.println("nhập không đúng, mời nhập lại! ");


            }
        } while (true);
    }
}
