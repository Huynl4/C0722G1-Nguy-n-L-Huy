package ss19_string_regex.practice.practice1;

public class EmailExampleTest {
    private static EmailExample emailExample;
    private static final String[] validEmail = new String[]{"a@mail.com", "ab@yahoo.com", "abc@hotmail.com"};
    private static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is" + email  + " is valid" + isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is" + email  + " is vlaid" + isvalid);
        }
    }
}
