package Leden;

import java.util.Scanner;

public class Metody_5 {

    public static int nacistVek() {
        Scanner scn = new Scanner(System.in);

        System.out.print("Zadejte svůj věk: ");
        int vek = scn.nextInt();

        return vek;
    }

    public static void overeniAlkohol(int vek) {
        if (vek >= 18) {
            System.out.println("Můžete pít alkohol.");
        } else {
            System.out.println("Nemůžete pít alkohol.");
        }
    }

    public static void main(String[] args) {

        int vek = nacistVek();

        overeniAlkohol(vek);

    }
}
