import java.util.Random;

public class IF {
    public static void main(String[] args) {
        Random random = new Random();

        int hodMinci = random.nextInt(2); // bude to panna - 0, orel - 1, protože tenhle interval můžeme označit, jako <0,2), a 2 tam nepatří


        // tady je podmínka pro výstup panny nebo orla
        if (hodMinci == 0){ // tady je hod minci nastaven nule, takže mi tady vyskoci panna
            System.out.println("Gratuluji vyhrál jste, PADLA PANNA!");
        }
        else { // tady mi vyskočí orel
            System.out.println("Bohužel někdy přístě, PADL OREL");

            System.out.println();
        }
    }
}
