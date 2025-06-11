package Červen.Dědičnost.Úkol2;

public class Student extends Person {
    private String school;

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Škola: " + school);
    }
}
