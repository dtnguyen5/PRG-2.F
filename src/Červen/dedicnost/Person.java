package Červen.dedicnost;

public class Person {
    String name;
    int age;
    String school;
    public Person(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public void introduce(){
        System.out.println("Jmenuji se: " + name + ", Věk: " + age);
    }
}
