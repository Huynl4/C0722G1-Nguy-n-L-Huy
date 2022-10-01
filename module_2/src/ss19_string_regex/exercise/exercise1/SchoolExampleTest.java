package ss19_string_regex.exercise.exercise1;

public class SchoolExampleTest {
    private static SchoolExample schoolExample;
    private static final String[] validSchool = new String[]{"C0318G", "A1998H"};
    private static final String[] invalidSchool = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        schoolExample = new SchoolExample();
        for (String school : validSchool) {
            boolean isvalid = schoolExample.validate(school);
            System.out.println("SchoolClass is" + school + " is valid " + isvalid);
        }
        for (String school : invalidSchool) {
            boolean isvalid = schoolExample.validate(school);
            System.out.println("SchoolClass is" + school + " is valid " + isvalid);
        }
    }
}
