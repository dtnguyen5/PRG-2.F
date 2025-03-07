package Listopad;

public class test {
    public static void main(String[] args) {

        int velikostMrizky = 8;

        for (int radek = 0; radek < velikostMrizky ; radek++) {
            for (int sloupec = 0; sloupec < velikostMrizky; sloupec++) {

                if ((sloupec + radek) % 2 == 0){
                    System.out.print(" ■ ");
                }
                else {
                    System.out.print(" X ");
                }
            }
            System.out.println();

        }
    }
}
