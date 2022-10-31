package ss19_string_regex.exercise.exercise2;

import ss19_string_regex.exercise.exercise1.ClassName;

public class NumberPhoneTest {
    private static NumberPhone numberPhone;
    public static final String[] validNumberPhone = new String[] { "(84)-(0978489648)", "(84)-(0678489648)", };
    public static final String[] invalidNumberPhone = new String[] { "(84)(0678489648)", "(84)-(1678489648)"};

    public static void main(String args[]) {
        numberPhone = new NumberPhone();
        for (String item : validNumberPhone) {
            boolean isvalid = numberPhone.validate(item);
            System.out.println("CLass is " + item +" is valid: "+ isvalid);
        }
        for (String item : invalidNumberPhone) {
            boolean isvalid = numberPhone.validate(item);
            System.out.println("CLass is " + item +" is valid: "+ isvalid);
        }
    }
}
