package Květen.Ucet;

public class Ucet {
    private static int generator = 100000;
    private String cisloUctu;
    private String majitel;
    private double zustatek;

    public Ucet(String majitel){
        this.majitel = majitel;
        this.cisloUctu = "ACC" + (++generator);
        this.zustatek = 0;
    }

    public void pridejCastku(double castka){ // Patrik Stauber

        if (castka > 0) {
            zustatek += castka;
        }
        else {
            System.out.println("Zadejte kladnou částku");
        }
    }

    public boolean vyberPenize(double castka){ // David Lipert
        if (castka > 0 && castka <= zustatek) {
            zustatek -= castka;
            System.out.println("Výběr proběhl úspešně");
            return true;
        }
        else {
            System.out.println("Výběr neprošel");
            return false;
        }
    }

    public boolean posliPenize(Ucet cil, double castka){ // Nguyen Duy Tiep
        if (castka > 0 && castka <= zustatek) {
            zustatek -= castka;
            cil.pridejCastku(castka);
            System.out.println("Převod proběhl úspěšně");
            return true;
        }
        else {
            System.out.println("Převod se nezdařil");
            return false;
        }
    }

    public void vypisZustatek(){ // Daniel Kozlík
        System.out.println(majitel + "-" + cisloUctu + "-" + (int)zustatek + "KČ");
    }

    public String getCisloUctu(){
        return cisloUctu;
    }

    public String getMajitel(){
        return majitel;
    }
}
