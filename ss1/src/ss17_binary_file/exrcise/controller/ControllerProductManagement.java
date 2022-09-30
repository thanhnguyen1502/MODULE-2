package ss17_binary_file.exrcise.controller;

import ss17_binary_file.exrcise.services.IServiceProductManagement;
import ss17_binary_file.exrcise.services.impl.ServiceProductManagement;

import java.util.Scanner;

public class ControllerProductManagement {
    private static Scanner scanner = new Scanner(System.in);
    private static IServiceProductManagement serviceProductManagement = new ServiceProductManagement();

    public static void displayMainProduct() {
        String choice = "";
        do {
            System.out.println("HỆ THỐNG QUẢNG LÝ SẢN PHẨM\" + \"\\n\" +\n" +
                    "                    \"1. Thêm sản phẩm\" + \"\\n\" +\n" +
                    "                    \"2. Hiển thị sản phẩm\" + \"\\n\" +\n" +
                    "                    \"3. cập nhật sản phẩm\" + \"\\n\" +\n" +
                    "                    \"4. Xóa sản phẩm\" + \"\\n\" +\n" +
                    "                    \"5. Tìm kiếm thông tin sản phẩm\" + \"\\n\" +\n" +
                    "                    \"6. Thoát\" + \"\\n\" +\n" +
                    "                    \">>> CHỌN CHỨC NĂNG <<<");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    serviceProductManagement.add();
                    break;
                case "2":
                    serviceProductManagement.display();
                    break;
                case "3":
                    serviceProductManagement.update();

                    break;
                case "4":
                    serviceProductManagement.remove();
                    break;
                case "5":
                    serviceProductManagement.find();
                    break;
                case "6":
                    System.exit(0);
            }
        } while (true);
    }
}
