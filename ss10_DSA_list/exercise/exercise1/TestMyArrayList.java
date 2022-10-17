package ss10_DSA_list.exercise.exercise1;

public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Cuong");
        Student student2 = new Student(2, "Sy");
        Student student3 = new Student(3, "Minh");
        Student student4 = new Student(4, "Lan");
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();

        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
        studentMyArrayList.add(student3);
        studentMyArrayList.add(student4);
        System.out.println(studentMyArrayList.getSize());

        System.out.println(studentMyArrayList.indexOf(student2));

        System.out.println(studentMyArrayList.contains(student1));

        newMyArrayList = studentMyArrayList.clone();
        newMyArrayList.remove(0);
        for (int i = 0; i < newMyArrayList.getSize(); i++) {
            System.out.println(newMyArrayList.get(i).getName());
        }
    }
}
