package ss16_io_text_file.exercise.exercise3.utils.exception;

import ss16_io_text_file.exercise.exercise3.model.Student;

import java.time.LocalDate;
import java.util.List;

public class PersonException extends Exception {
    public PersonException(String message) {
        super(message);
    }

    public static void codeCheck(String code) throws PersonException {
        if (code.matches("^[I][D][0-9]{3}")) {
            System.out.println("Nhập thành công.");
        } else throw new PersonException("Nhập không đúng định dạng.");
    }

    public static void genderCheck(String gender) throws PersonException {
        if (gender.matches("(Nam|Nữ| nam| nữ| LGBT)")) {
            System.out.println("Nhập thành công ");
        } else throw new PersonException("Nhập không đúng định dạng.");
    }

    public static void nameCheck(String name) throws PersonException {

        String[] arrName = name.trim().split(" ");
        for (String s : arrName) {
            if (!s.matches("[A-ZĐ][a-záàảạãăắằặẵâấầẫậẩéèẻẽẹêếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịùúủũụưứửữựỵỷỹýỳ]{1,5}")) {
                throw new PersonException("Tên không khớp chuẩn tiếng Việt, xin nhập lại");
            }
        }
        System.out.println("Nhập dữ liệu thành công");
    }

    public static void dateCheck(LocalDate birthday) throws PersonException {
        LocalDate presentDate = LocalDate.now().plusYears(-18);
        LocalDate maxDate = LocalDate.now().plusYears(-100);
        if (!birthday.isBefore(presentDate)) {
            throw new PersonException("nhập sai định dạng, nhập lại.");
        } else if (!birthday.isAfter(maxDate)) {
            throw new PersonException("nhập sai định dạng, nhập lại.");
        } else System.out.println("Nhập ngày tháng thành công");
    }

    public static boolean isCheckDuplicetedId(String code, List<Student> studentList) {
        for (Student student : studentList) {
            if (student.getCode().equals(code)) {
                return true;
            }
        }
        return false;
    }
}
