package Červen.Dědičnost.Úkol2;

public class Main {
    public static void main(String[] args) {

        Person p = new Person("Adam", 40);
        p.introduce();
        System.out.println();

        Student s = new Student("Eva", 17, "Gymnázium Praha");
        s.introduce();
        System.out.println();

        Teacher t = new Teacher("Petr", 35, "3.B");
        t.introduce();
    }
}
