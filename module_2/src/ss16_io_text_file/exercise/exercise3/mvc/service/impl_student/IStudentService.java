package ss16_io_text_file.exercise.exercise3.mvc.service.impl_student;

import java.io.IOException;

public interface IStudentService {
    void addStudent() throws IOException;

    void displayAllStudent();

    void removeStudent();

    void searchStudent();

    void sortStudent();
}
