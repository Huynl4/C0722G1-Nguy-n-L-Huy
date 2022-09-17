package ss0_exercise.mvc.view;

import ss0_exercise.mvc.controller.PersonController;
import ss0_exercise.mvc.controller.StudentController;
import ss0_exercise.mvc.controller.TeacherController;

public class Main {
    public static void main(String[] args) {
        PersonController.menuPerson();
        StudentController.menuStudent();
        TeacherController.menuTeacher();
    }

}
