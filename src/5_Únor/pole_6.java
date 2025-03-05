package Únor;

public class pole_6 {
    // Metoda pro zjištění, zda pole obsahuje duplicity
    public static boolean hasDuplicate(int[] arr) {
        // Projdeme každé číslo v poli
        for (int i = 0; i < arr.length; i++) {
            // Porovnáme aktuální číslo s ostatními
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) { // Pokud nalezneme duplicitu
                    return true;
                }
            }
        }
        // Pokud žádná duplicita nebyla nalezena
        return false;
    }

    public static void main(String[] args) {

        //Úkol 5
        //napište metodu static boolean hasDuplicate(int[] arr){}
        //metoda vrátí true - pokud je v poli duplicitní hodnota
        //{1, 2, 1, 0} - true -> 1 je v poli 2x
        //{2, 0, -2} - false -> každý prvek je v poli jen jednou

        int[] arr1 = {1, 2, 1, 0};
        int[] arr2 = {2, 0, -2};

        System.out.println("Má pole 1 duplicity? " + hasDuplicate(arr1));
        System.out.println("Má pole 2 duplicity? " + hasDuplicate(arr2));
    }
}
