import java.util.Scanner;

/**
 * Třída slouží k načtení dat z konzole od uživatele
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        SeznamFilmu seznamFilmu = new SeznamFilmu("Muj seznam");
        final int POCET_FILMU = 3;
        
        for (int i = 0; i < POCET_FILMU; i++) {

            String name = sc.next();
            double len = sc.nextDouble();
            int rating = sc.nextInt();
            int year = sc.nextInt();

            Film inputFilm = new Film(name, len, rating, year);

           // seznamFilmu.addFilm(inputFilm);
        }
      //  seznamFilmu.printInfo();
    }
}

class Film{
    
    Private String name;
    Private double length;
    Private int rating;
    Private int yearOfRelease;
    
    public Film(String name, double length, int rating, int yearOfRelease){
        
        this.name = name;
        this.length = length;
        this.rating = rating;
        this.yearOfRelease = yearOfReleas;
        
    }
    
    private String formatLength(){
        
        int hour = (int) (lenght / 60);
        int minutes = lenght % 60;
        
        return String.format("%d.%d", hour, minutes);
    }
    
    public void printInfo(){
        
        System.out.printf("%-20s%-10s%-15s%-16d\n", name, formatLength(), "★".repeat(rating), year);
    }
}
