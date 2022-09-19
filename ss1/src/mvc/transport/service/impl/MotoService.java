package mvc.transport.service.impl;

import mvc.transport.model.Moto;
import mvc.transport.model.Oto;
import mvc.transport.service.IMotoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotoService implements IMotoService {
    public static Scanner sc = new Scanner(System.in);
    public static List<Moto> motoList = new ArrayList<>();
    @Override
    public void add() {
        Moto moto = this.infoMoto();
        motoList.add(moto);
        System.out.println("thêm mới thành công! ");
    }

    @Override
    public void display() {
        System.out.println("danh sách xe máy\n");
        for (Moto moto: motoList) {
            System.out.println(moto);
        }
    }

    @Override
    public void remote() {
        System.out.println("Nhập biển kiểm soát muốn xoá: ");
        String idCar = sc.nextLine();
        boolean flag = false;
        for (Moto moto: motoList) {
            if (moto.getIdCar().equals(idCar)){
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int choice = Integer.parseInt(sc.nextLine());
                if (choice == 1){
                    motoList.remove(moto);
                    System.out.println("xoá thành công");
                }
                flag = true;
                System.out.println("không tìm thấy !");
                break;
            }
        }
    }

    @Override
    public void search() {
        System.out.println("nhập biển số xe muốn tìm !");
        String idCar = sc.nextLine();
        for (Moto moto: motoList) {
            if (moto.getIdCar().equals(idCar)){
                System.out.println(moto);
            }else {
                System.out.println("không tìm thấy ạ !");
            }
        }
    }
    public Moto infoMoto(){
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
        String wattage = sc.nextLine();
        Moto moto = new Moto(idCar,manufacturer,yearCar,owner,wattage);
        return moto;
    }
}
