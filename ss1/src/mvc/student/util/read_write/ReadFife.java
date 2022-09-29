package mvc.student.util.read_write;

import mvc.student.model.Student;
import mvc.student.model.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFife {
    public static List<String> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String> list = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine())!=null){
            list.add(line);
        }
        bufferedReader.close();
        return list;
    }

    public static List<Student> studentReadFile(String path) throws IOException {
        List<String> list = readFile(path);
        List<Student> students = new ArrayList<>();
        String [] info;
        for (String line: list ) {
            info = line.split(",");
            students.add(new Student(info[0],info[1],info[2],info[3],info[4],Double.parseDouble(info[5])));
        }
        return students;
    }

    public static List<Teacher> teacherReadFile(String path) throws IOException {
        List<String> list = readFile(path);     //list để đọc file
        List<Teacher> teacherList = new ArrayList<>();
        String [] info;
        for (String line: list){
            info = line.split(",");
            teacherList.add(new Teacher(info[0],info[1],info[2],info[3],info[4]));
        }
        return teacherList;
    }
}
