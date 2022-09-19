package mvc.transport.controller;

import mvc.transport.service.IMotoService;
import mvc.transport.service.IOtoService;
import mvc.transport.service.ITruckService;
import mvc.transport.service.impl.MotoService;
import mvc.transport.service.impl.OtoService;
import mvc.transport.service.impl.TruckService;

import java.util.Scanner;

public class AddTransport {
    public static Scanner sc = new Scanner(System.in);
    public static ITruckService truckService = new TruckService();
    public static IOtoService otoService = new OtoService();
    public static IMotoService motoService = new MotoService();
    public static void add(){
        int choice;
        do {
            System.out.println("1. Thêm xe tải\n" +
                    "2. Thêm ôtô\n" +
                    "3. Thêm  xe máy\n" +
                    "4. Trở lại menu ! ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    truckService.add();
                    break;
                case 2:
                    otoService.add();
                    break;
                case 3:
                    motoService.add();
                    break;
                case 4:
                    return;
            }
        }while (true);
    }
}
