package Test_priprava.OOP_na_patek.Balíček;

public class Balicek {

    private String id;
    private double hmotnostKg;
    private double vzdálenostKm;
    private int rok, mesic, den;

    // <--------------------- Metoda, která spočítá cenu dopravy podle vzorce --------------------->
    public double cena(){
        // první možnost
        double cena = hmotnostKg * 10 + vzdálenostKm * 0.05;
        return cena;

        // druhá možnost
        // return hmotnostKg * 10 + vzdálenostKm * 0.05;
    }

    // <--------------------- Konstruktor --------------------->
    public Balicek(String id, double hmotnostKg, double vzdálenostKm, int rok, int mesic, int den){

        this.id = id;

        if (hmotnostKg > 0 && hmotnostKg <= 30){
            this.hmotnostKg = hmotnostKg;
        }

        if (vzdálenostKm >= 0){
            this.vzdálenostKm = vzdálenostKm;
        }

        if (rok > 2025 || (rok == 2025 && mesic > 5) || (rok == 2025 && mesic == 5 && den >= 27)){
            this.rok = rok;
            this.mesic = mesic;
            this.den = den;
        }
        else {
            System.out.println("Chyba, datum nesmí být v minulosti");
        }
    }

    // <--------------------- Přetížený konstruktor --------------------->
    public Balicek(String id, double hmotnostKg, int rok, int mesic, int den){
        this(id, hmotnostKg, 0 , rok, mesic, den);
    }

    // <--------------------- GETTERY --------------------->
    public String getId() {
        return id;
    }

    public double getHmotnostKg() {
        return hmotnostKg;
    }

    public int getRok() {
        return rok;
    }

    public int getMesic() {
        return mesic;
    }

    public int getDen() {
        return den;
    }

    // <--------------------- GETTER a SETTER --------------------->
    public double getVzdálenostKm() {
        return vzdálenostKm;
    }

    public void setVzdálenostKm(double vzdálenostKm) {
        if (vzdálenostKm >= 0){
            this.vzdálenostKm = vzdálenostKm;
        }
    }
}
