package ss19_string_regex.exercise.exercise2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String NUMBERPHONE_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public NumberPhone() {
        pattern = Pattern.compile(NUMBERPHONE_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
