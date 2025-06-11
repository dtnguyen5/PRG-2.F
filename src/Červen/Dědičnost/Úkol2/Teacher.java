package Červen.Dědičnost.Úkol2;

public class Teacher extends Person{
    private String className;

    public Teacher(String name, int age, String className) {
        super(name, age);
        this.className = className;
    }
}
