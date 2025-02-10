package Únor;

public class trideni_pole {
    public static void main(String[] args) {

        // Bubblesort - porovnávání pak se prohodí

        String[] data = {"Bohdan", "Lucka", "Jakub", "Pavel"};
        int[] vysky = {185, 185, 190, 195};

        for (int i = 0; i < vysky.length - 1 ; i++) {

            if (vysky[0] > vysky[1]){
                int temp = vysky[0]; // 180
                vysky[0] = vysky[i + 1];
                vysky[ i + 1] = temp;
            }

        }
    }
}
