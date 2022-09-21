package caseStudy.services.impl;

import caseStudy.models.Employee;
import caseStudy.services.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    public static Scanner sc = new Scanner(System.in);
    public static List<Employee> employeeList = new ArrayList<>();

    @Override
    public void edit() {
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println("Id" + (i + 1) + "\t" + employeeList.get(i).getCode() + "\t" + "Name" + "\t" + employeeList.get(i).getName());
        }
        System.out.println("mời bạn nhập id cần chỉnh sửa");
        String employeeCode = sc.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).equals(employeeCode)){
                employeeList.remove(employeeList);
            }
        }
    }

    @Override
    public void add() {
        System.out.println("mời thêm mới ! ");
        Employee employee = this.infoEmployee();
        employeeList.add(employee);
        System.out.println("thêm mới thành công !");
    }

    @Override
    public void display() {
        System.out.println("danh sách nhân viên: ");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public Employee infoEmployee() {
        System.out.println("mời bạn nhập: ");
        System.out.println("mã: ");
        String code = sc.nextLine();
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
