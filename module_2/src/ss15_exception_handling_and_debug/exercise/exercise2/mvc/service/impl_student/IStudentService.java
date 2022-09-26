package ss15_exception_handling_and_debug.exercise.exercise2.mvc.service.impl_student;

import ss15_exception_handling_and_debug.exercise.exercise2.mvc.service.until.CodeException;

public interface IStudentService {
    void addStudent() throws CodeException;

    void displayAllStudent();

    void removeStudent();

    void searchStudent();

    void sortStudent();
    void addFakeData();
}
