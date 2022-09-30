package mvc.student.service.impl;

import mvc.student.model.Student;
import mvc.student.service.IStudentService;
import mvc.student.util.read_write.ReadFife;
import mvc.student.util.read_write.WriteFile;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> levelList = new ArrayList<>();
    private static List<Student> studentList = new ArrayList<>();
    private static final String STUDENT_CSV_PATH = "ss1/src/mvc/student/data/student.csv";


    @Override
    public void add() throws IOException {
        studentList= ReadFife.studentReadFile(STUDENT_CSV_PATH);
        Student student = this.infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công !");
        WriteFile.writeFileStudent(STUDENT_CSV_PATH,studentList);
    }


    @Override
    public void delete() throws IOException {
        studentList= ReadFife.studentReadFile(STUDENT_CSV_PATH);

        System.out.println("nhập vào id học sinh cần xóa: ");
        String idRemove = sc.nextLine();
        boolean isFlag = false;
        for (Student student : studentList) {
            if (student.getCode().equals(idRemove)) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(sc.nextLine());
                if (chooseYesNo == 1) {
                    studentList.remove(student);
                    System.out.println("Xóa thành công!.");
                }
                isFlag = true;
                break;
            }
        }
        WriteFile.writeFileStudent(STUDENT_CSV_PATH,studentList);
    }

    @Override
    public void display() throws IOException {
        studentList= ReadFife.studentReadFile(STUDENT_CSV_PATH);

        for (Student student : studentList) {
            System.out.println(student);
        }
//        WriteFile.writeFileStudent(STUDENT_CSV_PATH);
    }

    @Override
    public void search() throws IOException {
        studentList= ReadFife.studentReadFile(STUDENT_CSV_PATH);

        System.out.println("Tìm kiếm:\n" +
                "1. theo tên\n" +
                "2. theo mã");
        int choise = Integer.parseInt(sc.nextLine());
        switch (choise) {
            case 1:
                System.out.println("Nhập tên học sinh");
                String name = sc.nextLine();
                for (int i = 0; i < studentList.size(); i++) {
                    if (studentList.get(i).getName().contains(name)) {
                        System.out.println(studentList.get(i));
                    }
                }
                break;
            case 2:
                System.out.println("Nhập mã học sinh");
                String code = sc.nextLine();
                for (int i = 0; i < studentList.size(); i++) {
                    if (studentList.get(i).getName().equals(code)) {
                        System.out.println(studentList.get(i));
                        break;
                    }
                }
        }
        WriteFile.writeFileStudent(STUDENT_CSV_PATH,studentList);
    }

    @Override
    public void sortName() throws IOException {
        studentList = ReadFife.studentReadFile(STUDENT_CSV_PATH);
        for (int i = 0; i < studentList.size() - 1; i++) {
            for (int j = studentList.size() - 1; j > i; j--) {
                if (studentList.get(j).compareTo(studentList.get(j - 1)) < 0) {
                    Student temp = studentList.get(j);
                    studentList.set(j, studentList.get(j - 1));
                    studentList.set(j - 1, temp);
                }
            }
        }
        WriteFile.writeFileStudent(STUDENT_CSV_PATH,studentList);
    }

    public Student infoStudent() {
        String code;
        while (true){
            try{
                System.out.println("Enter code ?: ");
                code = sc.nextLine();
                if (!code.matches("[0-9]{2}")){
                    throw new NumberFormatException("bạn nhập không đúng rồi ☺ ");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Enter name ?");
        String name = sc.nextLine();

        System.out.println("Enter date of birth ?");
        String birth = sc.nextLine();
//        LocalDate birth;
//        try {
//            System.out.println("Enter date of birth ?");
//
//            birth = LocalDate.parse(sc.nextLine(),DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println("nhập không đúng định dạng !");
//        }

        System.out.println("Enter gender ?");
        String gender = sc.nextLine();
        System.out.println("Enter classer ?");
        String classer = sc.nextLine();
        System.out.println("Enter score ?");
        double score = Double.parseDouble(sc.nextLine());
        Student student = new Student(code, name, birth, gender, classer, score);
        return student;
    }
}
