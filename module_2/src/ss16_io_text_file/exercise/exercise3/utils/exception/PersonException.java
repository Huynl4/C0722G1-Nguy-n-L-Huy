package ss16_io_text_file.exercise.exercise3.utils.exception;

import java.time.LocalDate;

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
        if (gender.matches("(Nam|Nữ)")) {
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

//    public static void dateCheck(LocalDate date) throws PersonException {
//        if (date.matches("^(0?[1-9]|[12][0-9]|3[01])[\\\\/\\\\-](0?[1-9]|1[012])[\\\\/\\\\-]\\\\d{4}$")) {
//            System.out.println("Nhập thành công.");
//        } else throw new PersonException("Nhập sai, nhập lại..");
//    }
}
