package Leden;

public class pretizeni_metod {

    // Metoda se dvěma parametry
    public static void printMessage(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }

    public static void printMessage (int count, String message) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }


        public static void main(String[] args) {

        printMessage("Ahoj",3);
        printMessage(5, "Něco");

    }
}
