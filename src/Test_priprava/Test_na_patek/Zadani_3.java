package Test_priprava.Test_na_patek;

import java.util.Scanner;

public class Zadani_3 {

    // Prvni moznost

    private static String uvitaciZprava(String jmeno){

        String zprava = "Ahoj " + jmeno;

        return zprava;
    }



    // Druha moznost
    private static String uvitaciZprava2(Scanner scn){

        System.out.println("Zadejte vaše jmeno, jinak vas umlatim");
        String Jmeno = scn.next();
        String zprava = "Ahoj " + Jmeno;

        return zprava;
    }

    // Treti moznost
    private static String uvitaciZprava3(String jmeno){

        return "Ahoj " + jmeno;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Prvni moznost

        System.out.println(uvitaciZprava("Honza"));

        // Druha moznost
        System.out.println(uvitaciZprava2(scn));

        // Treti moznost
        System.out.println(uvitaciZprava3("Honzo"));

        scn.close();
    }

}
