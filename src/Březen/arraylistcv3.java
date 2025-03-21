package Březen;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistcv3 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        ArrayList<ArrayList<String>> seznamTrid = new ArrayList<>();

        System.out.println("Zadejte počet třídy: ");
        int pocetTrid = scn.nextInt();


        for (int i = 0; i < pocetTrid; i++) {

            seznamTrid.add(new ArrayList<>());

            System.out.println("Zadejte počet žáků v " + (i + 1) + ". třídě");
            int pocetZaku = scn.nextInt();

            System.out.println("Zadejte jména žáků: ");
            for (int j = 0; j < pocetZaku; j++) {

                String zak = scn.next();
                seznamTrid.get(i).add(zak);

            }

        }

        for (int i = 0; i < pocetTrid ; i++) {
            System.out.println(i + 1 + ". třída:" + seznamTrid().get(i));
        }

    }
}
