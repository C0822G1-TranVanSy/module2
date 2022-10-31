package ss19_string_regex.exercise.exercise1;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CLASSNAME_REGEX = "^[CAP]\\d{4}[G-IK-M]$";

    public ClassName() {
        pattern = Pattern.compile(CLASSNAME_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
