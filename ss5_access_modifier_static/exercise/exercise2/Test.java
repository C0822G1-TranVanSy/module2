package ss5_access_modifier_static.exercise.exercise2;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Sy");
        student1.setClasses("C08");

        System.out.println("Tên: " + student1.getName());
        System.out.println("Lớp: " + student1.getClasses());
    }
}
