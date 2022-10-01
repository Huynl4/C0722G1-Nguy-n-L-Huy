package ss16_io_text_file.exercise.exercise3.utils.exception;

public class IllegalCodeException extends Exception {
    public IllegalCodeException(String message) {
        super(message);
    }

    public static void codeCheck(String code) throws IllegalCodeException {
        if (code.matches("^[I][D][0-9]{3}")) {
            System.out.println("Nhập thành công.");
        } else throw new IllegalCodeException("Nhập không đúng định dạng.");
    }
}
