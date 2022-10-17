package ss10_DSA_list.exercise.exercise2;

public class TestLinkedList {
    public static void main(String[] args) {
        class Student{
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

        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1,"Minh");
        Student student2 = new Student(2,"Cuong");
        Student student3 = new Student(3,"Sy");
        Student student4 = new Student(4,"Lan");
        Student student5 = new Student(5,"Ngoc");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
        myLinkedList.add(2,student4);

//        myLinkedList.remove(2);
//        myLinkedList.remove(student1);


        for (int i = 0; i < myLinkedList.getSize() ; i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }

//        MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();

//        for (int i = 0; i < cloneLinkedList.getSize() ; i++) {
//            Student student = (Student) cloneLinkedList.get(i);
//            System.out.println(student.getName());
//        }

//        System.out.println(myLinkedList.contains(student1));
        System.out.println(myLinkedList.indexOf(student5));
    }
}
