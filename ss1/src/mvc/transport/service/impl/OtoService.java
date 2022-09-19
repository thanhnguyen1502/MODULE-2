package mvc.transport.service.impl;

import mvc.transport.model.Oto;
import mvc.transport.service.IOtoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtoService implements IOtoService {
    public static Scanner sc = new Scanner(System.in);
    public static List<Oto> otoList = new ArrayList<>();
    @Override
    public void add() {
        Oto oto = this.infoOto();
        otoList.add(oto);
        System.out.println("thêm mới thành công! ");
    }

    @Override
    public void display() {
        System.out.println("danh sách xe ô tô\n");
        for (Oto oto: otoList) {
            System.out.println(oto);
        }
    }

    @Override
    public void remote() {
        System.out.println("Nhập biển kiểm soát muốn xoá: ");
        String idCar = sc.nextLine();
        boolean flag = false;
        for (Oto oto: otoList) {
            if (oto.getIdCar().equals(idCar)){
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int choice = Integer.parseInt(sc.nextLine());
                if (choice == 1){
                    otoList.remove(oto);
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
        for (Oto oto: otoList) {
            if (oto.getIdCar().equals(idCar)){
                System.out.println(oto);
            }else {
                System.out.println("không có, mời nhập lại !");
            }
        }
    }

    public Oto infoOto(){
        System.out.println("mời bạn nhập\n");
        System.out.println("Biển số xe: ");
        String idCar = sc.nextLine();
        System.out.println("Tên hãng sản xuất: ");
        String manufacturer = sc.nextLine();
           System.out.println("Năm sản xuất: ");
        String yearCar = sc.nextLine();
           System.out.println("Chủ sở hữu: ");
        String owner = sc.nextLine();
           System.out.println("Chổ ngồi:  ");
        int noSeat = Integer.parseInt(sc.nextLine());
           System.out.println("Kiểu xe: ");
        String carType = sc.nextLine();
        Oto oto = new Oto(idCar,manufacturer,yearCar,owner,noSeat,carType);
        return oto;
    }
}
