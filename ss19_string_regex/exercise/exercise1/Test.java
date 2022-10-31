package ss19_string_regex.exercise.exercise1;

public class Test {
    private static ClassName className;
    public static final String[] validCLass = new String[] { "C0318G", "P0718G", };
    public static final String[] invalidCLass = new String[] { "M0318G", "P0323A"};

    public static void main(String args[]) {
        className = new ClassName();
        for (String item : validCLass) {
            boolean isvalid = className.validate(item);
            System.out.println("CLass is " + item +" is valid: "+ isvalid);
        }
        for (String item : invalidCLass) {
            boolean isvalid = className.validate(item);
            System.out.println("CLass is " + item +" is valid: "+ isvalid);
        }
    }
}
