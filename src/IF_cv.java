import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class IF_cv {
    public static void main(String[] args) {

        Scanner snc = new Scanner(System.in);
        System.out.println("Zadejte číslo, které je dělitelné 5");
        int a = snc.nextInt();

        if (a % 5 == 0) {
            System.out.println("Je dělitelný pěti");
        } else {
            System.out.println("není dělitelný pěti");
        }

    Random rdn = new Random();

    int soucet1 = rdn.nextInt(1, 7);
    int soucet2 = rdn.nextInt(1, 7);

        System.out.println("Zadejte čísla souctu1");
        System.out.println("Zadejte čísla souctu2");

    if(soucet1 + soucet2 >=10)

    {
        System.out.println("Vyhrali jste");
    }
    else

    {
        System.out.println("VYhrali jste");
    }

    int c = snc.nextInt();

    if(c = -100 || 100){


    }





    }
}
