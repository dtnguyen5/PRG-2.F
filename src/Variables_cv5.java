import java.util.Scanner;

public class Variables_cv5 {
    public static void main(String[] args) {
        /*
         * CV 4
         * Zeptejte se uživatele na jeho, jméno, příjmení, PSČ a rodné číslo
         * Údaje pak uživateli vypište
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte jméno");
        String jmeno = sc.next();

        System.out.println("Zadejte prijmeni");
        String prijmeni = sc.next();

        System.out.println("Zadejte PSC");
        int PSC = sc.nextInt();

        System.out.println("Zadejte rodné cislo");
        String rodnecislo = sc.next();

        System.out.println("jmeno" + jmeno);
        System.out.println("prijmeni" + prijmeni);
        System.out.println("PSC" + PSC);
        System.out.println("rodnecislo" + rodnecislo);
    }
}
