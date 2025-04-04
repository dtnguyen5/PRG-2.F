package Duben.OOP;

public class Kruznice {
    double polomer;

    public double obvod(){
        double Odvod = 2 * Math.PI * polomer;

        System.out.println(Odvod);
        return Odvod;
    }

    public double obsah(){
        double Obsah = Math.PI * polomer * polomer;

        System.out.println(Obsah);
        return Obsah;
    }
}
