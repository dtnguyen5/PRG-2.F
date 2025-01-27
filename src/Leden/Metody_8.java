package Leden;

import java.util.Scanner;

public class Metody_8 {

    public static double avg() {

        Scanner scn = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.println("Zadejte čísla, dokud nezadáte -1:");

        while (true) {
            int input = scn.nextInt();

            if (input == -1) {
                break;
            }

            sum += input;
            count++;
        }

        if (count == 0) {
            return 0;
        }
        return (double) sum / count;
    }

    public static double avg(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static double weightedAvg(int a, int b, int c, int wa, int wb, int wc) {
        return (a * wa + b * wb + c * wc) / (double) (wa + wb + wc);
    }
    public static void main(String[] args) {

        double prumer = avg();
        System.out.println("Průměr zadaných čísel: " + prumer);

        double prumerTrojice = avg(5, 10, 15);
        System.out.println("Průměr z čísel 5, 10, 15: " + prumerTrojice);

        double weightedPrumer = weightedAvg(5, 10, 15, 1, 2, 3);
        System.out.println("Vážený průměr: " + weightedPrumer);


    }
}
