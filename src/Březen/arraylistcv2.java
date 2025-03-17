package Březen;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistcv2 {

    public static void main(String[] args) {

        ArrayList<String> ukoly = new ArrayList<>();
        Scanner scn = new Scanner(System.in);

        System.out.println("Zadejte úkoly");

        boolean a = true;

        while (a){
            String ukol = scn.nextLine();

            if (ukol.equals("-1")){
                a = false;
            }
            ukoly.add(ukol);
        }

        
        System.out.println("Seznam úkolů");

        for (int i = 0; i < ukoly.size(); i++) {
            System.out.println(i + ": " + ukoly.get(i));
        }

        System.out.println("Chcete označit úkol, že je splněnej");

        if (scn.nextLine().equalsIgnoreCase("ano")){
            ukoly.remove(scn.nextInt() - 1);
        }

        System.out.println("Aktuální stav úkolů");
        for(String ukol : ukoly){
            System.out.println(ukol);
        }


    }

}
