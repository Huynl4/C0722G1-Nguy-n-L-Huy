package ss19_string_regex.exercise.exercise1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SchoolExample {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String SCHOOL_REGEX = "^[CAB][0-9]{4}[GHIKLM]$";

    public SchoolExample() {
        pattern = Pattern.compile(SCHOOL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
