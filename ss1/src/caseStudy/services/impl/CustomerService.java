package caseStudy.services.impl;

import caseStudy.models.Customer;
import caseStudy.services.ICustomerService;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    public static Scanner sc = new Scanner(System.in);
    public static LinkedList<Customer> customers = new LinkedList<>();
    static {
        customers.add(new Customer(1, "Thành", "15/2/1997", "Nam", "206026903", "01678595396", "thanh123@gmail.com", "SVIP", "Quảng Nam"));
        customers.add(new Customer(2, "Ngọc Lệ", "24/1/1997", "Nữ", "206026903", "01678595396","ngocle123@gmail.com" ,"VIP", "Quảng Nam"));
        customers.add(new Customer(3, "Thị Ngân", "02/03/1998", "Nữ", "206026903", "01678595396","nganngo123@gmail.com", "SSVIP", "Hà Nội"));
    }

    @Override
    public void edit() {
        System.out.println("Bạn muốn chỉnh sửa đoạn mã: ");
        int code1 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCode() == code1) {
                do {
                    int choice;
                    System.out.println("--- Chỉnh Sửa ---\n" +
                            "1. sửa mã\n" +
                            "2. sửa họ và tên\n" +
                            "3. sửa ngày sinh\n" +
                            "4. sửa giới tính\n" +
                            "5. sửa số CMND\n" +
                            "6. sửa số điện thoại\n" +
                            "7. sửa Email\n" +
                            "8. sửa cấp bậc\n" +
                            "9. sửa vị trí\n" +
                            "10. sửa lương");
                    choice = Integer.parseInt(sc.nextLine());
                    switch (choice){
                        case 1:
                            System.out.println("sửa mã: ");
                            customers.get(i).setCode(Integer.parseInt(sc.nextLine()));
                            System.out.println("đã chỉnh sửa");
                            break;
                        case 2:
                            System.out.println("sửa họ và tên: ");
                            customers.get(i).setName(sc.nextLine());
                            System.out.println("đã chỉnh sửa");
                            break;
                        case 3:
                            System.out.println("sửa ngày sinh: ");
                            customers.get(i).setBirthDay(sc.nextLine());
                            System.out.println("đã chỉnh sửa");
                            break;
                        case 4:
                            System.out.println("Sửa giới tính: ");
                            customers.get(i).setGender(sc.nextLine());
                            System.out.println("đã chỉnh sửa");
                            break;
                        case 5:
                            System.out.println("Sửa số CMND: ");
                            customers.get(i).setCardID(sc.nextLine());
                            System.out.println("đã chỉnh sửa");
                            break;
                        case 6:
                            System.out.println("sửa số điện thoại: ");
                            customers.get(i).setNumberPhone(sc.nextLine());
                            System.out.println("đã chỉnh sửa");
                            break;
                        case 7:
                            System.out.println("sửa Email: ");
                            customers.get(i).setEmail(sc.nextLine());
                            System.out.println("đã chỉnh sửa");
                            break;
                        case 8:
                            System.out.println("sửa kiểu người: ");
                            customers.get(i).setTypeOfGuest(sc.nextLine());
                            System.out.println("đã chỉnh sửa");
                            break;
                        case 9:
                            System.out.println("Sửa địa chỉ́: ");
                            customers.get(i).setAddress(sc.nextLine());
                            System.out.println("đã chỉnh sửa");
                            break;

                        default:
                            System.out.println("nhập sai, mời bạn nhập lại !");
                    }
                    return;


                }while (true);
            }
        }
    }

    @Override
    public void add() {
        System.out.println("mời nhập mới !");
        Customer customer = this.infoCustumer();
        customers.add(customer);
        System.out.println("thêm mới thành công! ");
    }

    @Override
    public void display() {
        System.out.println("Danh sách khách hàng! ");
        for (Customer customer: customers) {
            System.out.println(customer);
        }
    }
    public Customer infoCustumer() {
        System.out.println("mời bạn nhập: ");
        System.out.println("mã: ");
        int code = Integer.parseInt(sc.nextLine());
        System.out.println("Họ và tên: ");
        String name = sc.nextLine();
        System.out.println("Ngày sinh: ");
        String birthDay = sc.nextLine();
        System.out.println("Giới tính: ");
        String gender = sc.nextLine();
        System.out.println("Số CMND: ");
        String cardID = sc.nextLine();
        System.out.println("Số điện thoại: ");
        String numberPhone = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Kiểu khách hàng: ");
        String typeOfGuest = sc.nextLine();
        System.out.println("Địa chỉ: ");
        String address = sc.nextLine();

        Customer customer = new Customer(code, name, birthDay, gender, cardID, numberPhone, email, typeOfGuest, address);
        return customer;
    }
}
