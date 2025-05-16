package Květen.Kruznice;

public class Kruznice {
    private double polomer;

    public double getPolomer() {
        return polomer;
    }

    public void setPolomer(double polomer){
        if(polomer < 0.0) {
            return;
        }
        this.polomer = polomer;
    }

}