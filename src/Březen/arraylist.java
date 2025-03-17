package Březen;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {

        // Arraylist - dynamické vytvoření pole, má určenou velikost - není pevně stanovena velikost

        ArrayList<String> auta = new ArrayList<>();

        auta.add("Mazda");
        auta.add("Škoda");
        auta.add("Mercedes");
        auta.add("Fiat Punto");

        System.out.println(auta.get(3));

        System.out.println(auta.size());
        // 2 možnosti, jak to mohu odstranit
        // auta.remove(3);
        boolean jeSmazano =  auta.remove("Fiat Punto"); // Vrátí mi True, pokud se mu to podaří smazat
        System.out.println(auta.size()); // Vypíše mi velikost toho pole
        System.out.println(jeSmazano);
        auta.set(1, "Pagani Zonda"); // Nahradí mi to Škodovku
        System.out.println(auta.get(1));

        System.out.println(auta);


    }
}
