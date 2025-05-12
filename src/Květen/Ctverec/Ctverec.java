package Květen.Ctverec;

public class Ctverec {

    double delkaStrany;

    public Ctverec(double value){

        if (value < 0){
            value = 0.0;
        }
        else {
            this.delkaStrany = value;
        }
    }
}
