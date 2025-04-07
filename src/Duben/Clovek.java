package Duben;

public class Clovek {

    // Duben.OOP
    String jmeno;
    String prijmeni;
    int vek;
    int dluh;
    long penize;

    void spat(){
        System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZ");
    }

    void zit(){
        System.out.println("Ziju");
    }

    void umrit(){
        System.out.println(":(");
    }
    public static void main(String[] args) {

        Clovek jakub = new Clovek();

        jakub.jmeno = "Jakub";
        jakub.prijmeni = "Hnilička";


        Clovek Vaclav = new Clovek();

        Vaclav.jmeno = "Václav";
        Vaclav.prijmeni = "Mach";
        Vaclav.penize = 1_000;
        Vaclav.dluh = 100;

        System.out.println(Vaclav.dluh);


    }
}
