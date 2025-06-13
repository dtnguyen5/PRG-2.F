package Červen.dedicnost;

public class Student extends Person {
    private String school;

    public Student(String name, int age, String school) {
        super(name, age, school);
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Chodím na školu: " + school);
    }
}
