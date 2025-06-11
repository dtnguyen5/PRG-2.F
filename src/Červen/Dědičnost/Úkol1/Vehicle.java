package Červen.Dědičnost.Úkol1;

public class Vehicle {
    protected int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public void move() {
        System.out.println("Vozidlo se pohybuje");
    }
}
