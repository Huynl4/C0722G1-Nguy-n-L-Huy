package ss0_exercise.mvc.vieww;

import ss0_exercise.mvc.controler.PersonController;
import ss0_exercise.mvc.controler.StudentController;
import ss0_exercise.mvc.controler.TeacherController;

public class Main {
    public static void main(String[] args) {
        PersonController.menuPerson();
        StudentController.menuStudent();
        TeacherController.menuTeacher();
    }

}
