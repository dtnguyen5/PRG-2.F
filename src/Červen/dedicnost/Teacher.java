package Červen.dedicnost;

public class Teacher extends Person{
    String className;

    public Teacher(String name, int age, String school) {
        super(name, age, school);
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Učím třídu:" + className);
    }
}
