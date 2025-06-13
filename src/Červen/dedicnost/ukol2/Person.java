package Červen.dedicnost.ukol2;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce(){
        System.out.println("Jmenuji se " + name + ", Věk: " + age);
    }
}
