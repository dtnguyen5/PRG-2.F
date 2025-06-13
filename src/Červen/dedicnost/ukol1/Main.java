package Červen.dedicnost.ukol1;

public class Main {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.move();

        Car car = new Car();
        car.move();

        car.barva = "modra";
        car.claxonNoise = "HAF HAF";

        Vehicle noveAuto = new Car();
        ((Car)noveAuto).barva = "Bila";

    }
}
