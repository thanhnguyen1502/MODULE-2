package mvc.student.view;

import mvc.student.controller.Controller;

public class MainView {
    public static void main(String[] args) {
        Controller studentController = new Controller();
        studentController.displayMenu();
    }
}
