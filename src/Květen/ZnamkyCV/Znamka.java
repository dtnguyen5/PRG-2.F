package Květen.ZnamkyCV;

public class Znamka {
    private int hodnota;
    private String nazevPredmetu;

    public int getHodnota() {
        return hodnota;
    }

    public Znamka(int hodnota, String nazevPredmetu) {
        this.hodnota = hodnota;
        this.nazevPredmetu = nazevPredmetu;
    }

    public String getNazevPredmetu() {
        return nazevPredmetu;
    }

    public boolean setHodnota(int hodnota) {
        if (hodnota >= 1 && hodnota <= 5){
            this.hodnota = hodnota;
            return true;
        }
        return false;
    }
}
