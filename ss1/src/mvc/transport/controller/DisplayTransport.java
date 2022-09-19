package mvc.transport.controller;

import mvc.transport.service.IMotoService;
import mvc.transport.service.IOtoService;
import mvc.transport.service.ITruckService;
import mvc.transport.service.impl.MotoService;
import mvc.transport.service.impl.OtoService;
import mvc.transport.service.impl.TruckService;

import java.util.Scanner;

public class DisplayTransport {
    public static Scanner sc = new Scanner(System.in);
    public static ITruckService truckService = new TruckService();
    public static IOtoService otoService = new OtoService();
    public static IMotoService motoService = new MotoService();
    public static void display(){
        int choice;
        do {
            System.out.println("1. Hiển thị xe tải\n" +
                    "2. Hiển thị ôtô\n" +
                    "3. Hiển thị xe máy\n" +
                    "4. Trở lại menu ! ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    truckService.display();
                    break;
                case 2:
                    otoService.display();

                    break;
                case 3:
                    motoService.display();

                    break;
                case 4:
                    return;
            }
        }while (true);
    }
}
