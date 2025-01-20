package Leden;

public class Rekurze {

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
        printMessage(count,message);
    }
    public static void main(String[] args) {

    }
}
