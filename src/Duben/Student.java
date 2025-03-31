package Duben;

import java.util.Arrays;

public class Student {

    private String jmeno;
    private int[] znamky;

    public Student(){
        this("Jan", new int[]{1,2,5});
    }

    public Student(String jmeno){
        this(jmeno, new int[]{2,4,5});
    }

    public Student(String jmeno, int[] znamky){
        this.jmeno = jmeno;
        this.znamky = znamky;
    }
    public void vypisInfo(){
        System.out.println(jmeno + " " + Arrays.toString(znamky));
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Pepik");
        Student student3 = new Student("Josef", new int[] {1,2,3});
        student1.vypisInfo();
        student2.vypisInfo();
        student3.vypisInfo();
    }
}
