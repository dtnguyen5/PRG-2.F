package Test_priprava.OOP_na_patek.Kino;

public class KinoPredstaveni {
    private String nazev;
    private int hodina;
    private int minuta;
    private int delkaMin;
    private int volnaMista;

    // <--------------------- Metoda pro výpis --------------------->
    public void printInfo(){
        System.out.println("KinoPředstavení: " + nazev +
                ", začátek " + hodina + ":" + minuta +
                ", délka " + delkaMin + " min, volno "
                + volnaMista + " míst");
    }

    // <--------------------- Konstruktor --------------------->
    public KinoPredstaveni(String nazev, int hodina, int minuta, int delkaMin, int volnaMista){

        this.nazev = nazev;

        // první možnost
        if (hodina >= 0 && hodina < 24){
            this.hodina = hodina;
        }

        if (minuta >= 0 && minuta < 60){
            this.minuta = minuta;
        }

        if (delkaMin > 0){
            this.delkaMin = delkaMin;
        }

        if (volnaMista >= 0 && volnaMista <= 200){
            this.volnaMista = volnaMista;
        }

        // druhá možnost
        /*
        if (hodina >= 0 && hodina <= 23){
            this.hodina = hodina;
        }

        if (minuta >= 0 && minuta <= 59){
            this.minuta = minuta;
        }

        if (delkaMin > 0){
            this.delkaMin = delkaMin;
        }

        if (volnaMista >= 0 && volnaMista <= 200){
            this.volnaMista = volnaMista;
        }
         */

    }

    // <--------------------- Přetížený konstruktor --------------------->
    public KinoPredstaveni(String nazev, int hodina, int minuta, int delkaMin){

        this(nazev, hodina, minuta, delkaMin,100);

    }

    // <--------------------- GETTERY --------------------->
    public int getDelkaMin() {
        return delkaMin;
    }

    public int getMinuta() {
        return minuta;
    }

    public int getHodina() {
        return hodina;
    }

    public String getNazev() {
        return nazev;
    }

    // <--------------------- GETTER a SETTER --------------------->
    public int getVolnaMista() {
        return volnaMista;
    }

    public void setVolnaMista(int volnaMista) {

        if (volnaMista >= 0 && volnaMista <= 200){
            this.volnaMista = volnaMista;
        }

    }
}


