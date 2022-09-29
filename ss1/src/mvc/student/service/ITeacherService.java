package mvc.student.service;

import java.io.IOException;

public interface ITeacherService {
    void add() throws IOException;
    void delete() throws IOException;
    void display() throws IOException;
    void search() throws IOException;
    void sortName() throws IOException;

}
