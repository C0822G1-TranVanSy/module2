package casy_study.mvc.models;

public class Employee extends Person{
    private String lever;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, String dateOfBirth, boolean gender, int identityCard, String numberPhone, String email, String lever, String position, int salary) {
        super(id, name, dateOfBirth, gender, identityCard, numberPhone, email);
        this.lever = lever;
        this.position = position;
        this.salary = salary;
    }

    public String getLever() {
        return lever;
    }

    public void setLever(String lever) {
        this.lever = lever;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
