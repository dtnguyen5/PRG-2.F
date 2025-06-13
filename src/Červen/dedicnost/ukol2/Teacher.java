package Červen.dedicnost.ukol2;

public class Teacher extends Person{
    private String className;

    public Teacher(String name, int age, String className) {
        super(name, age);
        this.className = className;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Učím třídu: " + className);
    }
}
