package Test_priprava.Test_na_patek;

public class priprava_na_test {

    // první cviceni
    private static int soucetCisel(int a, int b){
        return a + b;

    }

    // druhe cviceni
    private static boolean jeSude(int cislo){
        return cislo % 2 == 0;
    }

    private static String uviraciZprava(String jmeno){

        return "Ahoj " + jmeno + " vitej";
    }

    // cvrty priklad
    private static double mocnina(double a, double b){ // udelano pomoci rekurze

        if (b == 0){
            return 1;
        }
        else if (b < 0){
            return 1;
        }
        return a * mocnina(a, b - 1);
    }

    // cvrty priklad - ne rekurzivne

    // paty priklad - faktorial

    private static int facktorial(int cislo){
        int vysledek = 1;

        for (int i = 1; i < cislo; i++) {
            vysledek = vysledek * 1;
        }
        return vysledek;
    }

    // paty priklad - faktorial rekurzivne

    private static int fackTorialRekurzivne(int n ){

        if (n == 1){
            return 1;
        }
        return n * fackTorialRekurzivne(n - 1);
    }

    private static

    public static void main(String[] args) {

        // první cviceni
        System.out.println(soucetCisel(1, 1));

        // druhe cviceni
        System.out.println(jeSude(2));

        // treti cviceni
        System.out.println(uviraciZprava("Honzo"));

        // cvrty priklad
        System.out.println(mocnina(4,2));

    }

}
