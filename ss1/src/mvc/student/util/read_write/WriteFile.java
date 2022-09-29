package mvc.student.util.read_write;

import mvc.student.model.Student;
import mvc.student.model.Teacher;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    private static void writeFile(String path, String data) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(data);
        bufferedWriter.close();
    }


    public static void writeFileStudent(String path, List<Student> students) throws IOException {
        String data = "";
        for (Student student : students) {
            data += student.toString();
            data += "\n";

        }
        writeFile(path, data);


    }

    public static void writeFileTeacher(String path, List<Teacher> teachers) throws IOException {
        String data = "";
        for (Teacher teacher : teachers) {
            data += teacher.toString();
            data += "\n";

        }
        writeFile(path,data);

    }
}
