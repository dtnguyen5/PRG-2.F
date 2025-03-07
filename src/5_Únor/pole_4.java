package Únor;

public class pole_4 {

    // Metoda pro nalezení minima
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Metoda pro nalezení maxima
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        // Úkol 3
        //napište metodu static int findMin(int[] arr){} která vrátí nejmenší číslo v poli
        //{1, 2, 3, -5, 0, 8} -> metoda vrátí -5
        //vytvořte podobnou metodu findMax, která najde maximu

        int[] pole = {1, 2, 3, -5, 0, 8};

        System.out.println("Minimální číslo v poli: " + findMin(pole));
        System.out.println("Maximální číslo v poli: " + findMax(pole));

    }
}
