package ss16_io_text_file.exercise.exercise3.vieww;

import ss16_io_text_file.exercise.exercise3.controler.PersonController;
import ss16_io_text_file.exercise.exercise3.utils.exception.PersonException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, PersonException {
        PersonController.menuPerson();
    }
}
