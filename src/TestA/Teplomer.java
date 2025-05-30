package TestA;

public class Teplomer {

    private String umisteni;
    private double teplota;
    private boolean vCelzii;


    // <----------------------------- Výpis ----------------------------->
    public void printInfo(){

        String jednotka;
        if (vCelzii){
            jednotka = "°C";
        }
        else {
            jednotka = "°F";
        }

        System.out.println("Teploměr: učebna " + umisteni + " - " + teplota + jednotka  );
    }

    // <----------------------------- Kontstruktor ----------------------------->
    public Teplomer(String umisteni, double teplota, boolean vCelzii){

        this.umisteni = umisteni;
        this.vCelzii = vCelzii;

        if (teplota >= -50 && teplota <= 60){
            this.teplota = teplota;
        }

    }

    // <----------------------------- Přetížený kontstruktor ----------------------------->
    public Teplomer(String umisteni, double teplota){
        this(umisteni, teplota, true);
    }

    // <----------------------------- Gettery ----------------------------->
    public boolean isvCelzii() {
        return vCelzii;
    }

    public String getUmisteni() {
        return umisteni;
    }

    // <----------------------------- Getter a Setter ----------------------------->
    public double getTeplota() {
        return teplota;
    }

    public void setTeplota(double teplota) {
        if (teplota >= -50 && teplota <= 60){
            this.teplota = teplota;
        }
    }
}
