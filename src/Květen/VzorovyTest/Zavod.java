package Květen.VzorovyTest;

public class Zavod {
    private String misto;
    private int rok;
    private int mesic;
    private int den;

    public Zavod(int rok, int mesic, int den, String misto){
        this.misto = misto;
        this.rok = rok;
        this.mesic = mesic;
        this.den = den;
    }
    public Zavod(String misto, int rok, int mesic, int den){
        this.misto = misto;
       // this.rok = rok;
        setRok(rok);
       // this.mesic = mesic;
        setMesic(mesic);
        // this.den = den;
        setDen(den);
    }

    public String getMisto() {
        return misto;
    }

    public void setMisto(String misto) {
        this.misto = misto;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        if (rok > 2024){
            this.rok = rok;
        }
    }

    public int getMesic() {
        return mesic;
    }

    public void setMesic(int mesic) {

        if (mesic > 5){
            this.mesic = mesic;
        }
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        if (den > 25){
            this.den = den;
        }
    }
    public void printInfo(){
        System.out.println("Závod se koná:" + den + "." + mesic + "." + rok + "," + misto );
    }
}
