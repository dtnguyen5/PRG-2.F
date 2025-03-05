package Listopad;

public class Vložene_cykly {
    public static void main(String[] args) {

        int velikostMrizky = 5;

        for(int radek = 0; radek < velikostMrizky; radek++){
            for(int sloupec = 0; sloupec < velikostMrizky; sloupec++){
                if (radek == velikostMrizky - 1 || radek == 0 || radek == sloupec ){
                    System.out.print(" x ");
                }
                else {
                    System.out.print(" ■ ");
                }
            }
            System.out.println();
        }
    }
}
