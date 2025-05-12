package Duben;

import java.security.PublicKey;
import java.util.Random;

public class Student {

    private String jmeno;
    private int znamky[];

    public Student(String jmeno, int pocetZnamek){
        this.jmeno = jmeno;
        this.znamky = new int[pocetZnamek];
    }

    public int generujZnamku(){
        Random rdn = new Random();
        return rdn.nextInt(6);
    }

    public void generujZnamky(){
        for (int i = 0; i < znamky.length ; i++) {
            znamky[i] = generujZnamku();
        }
    }

    public double vypisPrumeru(){

        if (znamky.length == 0){
            return 0;
        }

        double soucet = 0;
        for (int znamka : znamky){
            soucet += znamka;
        }
        return soucet / znamky.length;
    }

    public static void main(String[] args) {

     Student student = new Student("Pepa", 20);
     student.generujZnamky();
     System.out.println("Průměr známek: " + student);

    }
}
