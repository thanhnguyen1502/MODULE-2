package caseStudy.services.impl;

import caseStudy.models.Employee;
import caseStudy.services.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    public static List<Employee> employees = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    static {
        employees.add(new Employee(1, "Thành", "15/2/1997", "Nam", "206026903", "01678595396", "thanh123@gmail.com", "Trưởng phòng", "Chủ tịch","2000"));
        employees.add(new Employee(2, "Ngọc Lệ", "24/1/1997", "Nữ", "206026903", "01678595396","ngocle123@gmail.com" ,"Thư ký", "Thư ký", "2000000"));
        employees.add(new Employee(3, "Thị Ngân", "02/03/1998", "Nữ", "206026903", "01678595396","nganngo123@gmail.com", "Kế toán", "Kế toán", "3000000"));
    }

    @Override
    public void edit() {
        System.out.println("Bạn muốn chỉnh sửa đoạn mã: ");
        int code1 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getCode() == code1) {
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
                            employees.get(i).setCode(Integer.parseInt(sc.nextLine()));
                            System.out.println("đã chỉnh sửa");
                            break;
                        case 2:
                            System.out.println("sửa họ và tên: ");
                            employees.get(i).setName(sc.nextLine());
                            System.out.println("đã chỉnh sửa");
                            break;
                        case 3:
                            System.out.println("sửa ngày sinh: ");
                            employees.get(i).setBirthDay(sc.nextLine());
                            System.out.println("đã chỉnh sửa");
                            break;
                        case 4:
                            System.out.println("Sửa giới tính: ");
                            employees.get(i).setGender(sc.nextLine());
                            System.out.println("đã chỉnh sửa");
                            break;
                        case 5:
                            System.out.println("Sửa số CMND: ");
                            employees.get(i).setCardID(sc.nextLine());
                            System.out.println("đã chỉnh sửa");
                            break;
                        case 6:
                            System.out.println("sửa số điện thoại: ");
                            employees.get(i).setNumberPhone(sc.nextLine());
                            System.out.println("đã chỉnh sửa");
                            break;
                        case 7:
                            System.out.println("sửa Email: ");
                            employees.get(i).setEmail(sc.nextLine());
                            System.out.println("đã chỉnh sửa");
                            break;
                        case 8:
                            System.out.println("sửa Cấ́p bậc: ");
                            employees.get(i).setLever(sc.nextLine());
                            System.out.println("đã chỉnh sửa");
                            break;
                        case 9:
                            System.out.println("Sửa vị trí: ");
                            employees.get(i).setLocation(sc.nextLine());
                            System.out.println("đã chỉnh sửa");
                            break;
                        case 10:
                            System.out.println("sửa Lương: ");
                            employees.get(i).setSalary(sc.nextLine());
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
        System.out.println("mời thêm mới ! ");
        Employee employee = this.infoEmployee();
        employees.add(employee);
        System.out.println("thêm mới thành công !");
    }

    @Override
    public void display() {
        System.out.println("danh sách nhân viên: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public Employee infoEmployee() {
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
        System.out.println("Cấp bậc: ");
        String lever = sc.nextLine();
        System.out.println("Vị trí: ");
        String location = sc.nextLine();
        System.out.println("Lươnǵ: ");
        String salary = sc.nextLine();
        Employee employee = new Employee(code, name, birthDay, gender, cardID, numberPhone, email, lever, location, salary);
        return employee;
    }
}
