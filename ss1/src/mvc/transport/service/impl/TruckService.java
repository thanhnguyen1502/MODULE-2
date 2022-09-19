package mvc.transport.service.impl;

import mvc.transport.model.Truck;
import mvc.transport.service.ITruckService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruckService {
public static Scanner sc = new Scanner(System.in);
public static List<Truck> truckList= new ArrayList<>();
    @Override
    public void add() {
        Truck truck = this.infoTruck();
        truckList.add(truck);
        System.out.println("thêm mới thành công! ");
    }

    @Override
    public void display() {
        System.out.println("danh sách xe tải\n");
        for (Truck truck: truckList) {
            System.out.println(truck);
        }
    }

    @Override
    public void remote() {
        System.out.println("nhập biển kiểm soát muốn xoá: ");
        String idCar = sc.nextLine();
        boolean flag = true;
        for (Truck truck: truckList) {
            if (idCar.equals(truck.getIdCar())){
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int choice = Integer.parseInt(sc.nextLine());
                if (choice == 1){
                    truckList.remove(truck);
                    System.out.println("xoá thành công !");
                    break;
                }
                flag = false;
                System.out.println("không tìm thấy !");
            }
        }
    }

    @Override
    public void search() {
        System.out.println("nhập biển kiểm soát muốn tìm kiếm: ");
        String idCar = sc.nextLine();
        for (Truck truck: truckList) {
            if (idCar.equals(truck.getIdCar())){
                System.out.println(truck);
            }else {
                System.out.println("không tìm thấy !");
            }
        }
    }
    public Truck infoTruck(){
        System.out.println("mời bạn nhập\n");
        System.out.println("Biển số xe: ");
        String idCar = sc.nextLine();
        System.out.println("Tên hãng sản xuất: ");
        String manufacturer = sc.nextLine();
        System.out.println("Năm sản xuất: ");
        String yearCar = sc.nextLine();
        System.out.println("Chủ sở hữu: ");
        String owner = sc.nextLine();
        System.out.println("Công suất: ");
        String tonnage = sc.nextLine();
        Truck truck = new Truck(idCar,manufacturer,yearCar,owner,tonnage);
        return truck ;
    }
}
