package case_study.utils;

import java.time.LocalDate;

public class PersonException extends Exception {
    public PersonException(String message) {
        super(message);
    }

    public static final void idCheck(String id) throws PersonException {
        if (id.matches("^[I][D][0-9]{3}")) {
            System.out.println("Nhập thành công.");
        } else throw new PersonException("Nhập không đúng định dạng.");
    }

    public static final void nameCheck(String name) throws PersonException {

        String[] arrName = name.trim().split(" ");
        for (String s : arrName) {
            if (!s.matches("[A-ZĐ][a-záàảạãăắằặẵâấầẫậẩéèẻẽẹêếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịùúủũụưứửữựỵỷỹýỳ]{1,5}")) {
                throw new PersonException("Tên không khớp chuẩn tiếng Việt, xin nhập lại");
            }
        }
        System.out.println("Nhập dữ liệu thành công");
    }

    public static final void genderCheck(String gender) throws PersonException {
        if (gender.matches("Nam|Nữ|nam|nữ")) {
            System.out.println("Nhập thành công");
        } else {
            throw new PersonException("Nhâp sai định dạng");
        }
    }

    public static void idCardCheck(String idCard) throws PersonException {
        if (idCard.matches("[0-9]{12}|[0-9]{9}")) {
            System.out.println("Nhập thành công");
        } else throw new PersonException("Nhập sai định dạng");
    }

    public static void PhoneCheck(String numberPhone) throws PersonException {
        if (numberPhone.matches("0[0-9][1-9]{8}")) {
            System.out.println("Nhập thành công");
        } else throw new PersonException("Nhập sai định dạng");
    }

    public static void emailCheck(String email) throws PersonException {
        if (email.matches("[A-Za-z0-9]{3,}[@](gmail.com|codegym.edu.(vn|com)|yahoo.com)")) {
            System.out.println("Nhập thành công");
        } else throw new PersonException("Nhập sai định dạng");
    }

    public static void customerAgeCheck(LocalDate birthday) throws PersonException {
        LocalDate presentDate = LocalDate.now().plusYears(-18);
        LocalDate maxDate = LocalDate.now().plusYears(-100);
        if (!birthday.isBefore(presentDate)) {
            throw new PersonException("phải trên 18 tuổi, nhập lại.");
        } else if (!birthday.isAfter(maxDate)) {
            throw new PersonException(" phải dưới 100 tuổi, nhập lại.");
        } else System.out.println("Nhập ngày tháng năm khách hàng thành công");
    }
}
