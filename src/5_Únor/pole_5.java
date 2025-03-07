package Únor;

public class pole_5 {

    // Metoda pro převod binárního čísla na desítkové
    public static int binToDec(int[] bin) {
        int dec = 0;
        int power = 0;
        for (int i = bin.length - 1; i >= 0; i--) {
            if (bin[i] == 1) {
                dec += Math.pow(2, power);
            }
            power++;
        }
        return dec;
    }

    public static void main(String[] args) {

        //Úkol 4
        //vytvořte si pole jedniček a nul. Například: {1, 0, 0, 1, 1, 0, 1, 1}
        //pole reprezentuje číslo v binární soustavě (v příklad: 10011011)
        //napište metodu static int binToDec(int[] bin){} která vrátí číslo v desítkové soustavě
        //10011011 => 128 + 16 + 8 + 2 + 1 = 155

        int[] bin = {1, 0, 0, 1, 1, 0, 1, 1};

        System.out.println("Desítková hodnota binárního čísla: " + binToDec(bin));

    }
}
