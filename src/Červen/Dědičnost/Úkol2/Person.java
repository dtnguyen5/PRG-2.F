package Červen.Dědičnost.Úkol2;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Jméno: " + name + ", Věk: " + age);
    }
}
