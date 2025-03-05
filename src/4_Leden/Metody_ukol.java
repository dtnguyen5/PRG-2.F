package Leden;

public class Metody_ukol {

    static void validatePassword(String password){

        boolean valid = true;


        // 1. Heslo musí být alespoň 8 znaků.

        if (password.length() < 8) {
            System.out.println("Heslo nesplňuje jednu z podmínek: \"délka\"");
            valid = false;
        }


        // 2. Heslo nesmí obsahovat slovo "heslo"

        if (password.toLowerCase().contains("heslo")) { // contains mi tady zkontroluje, jestli v textu je podřetězec "heslo"
            System.out.println("Heslo nesplňuje jednu z podmínek: \"obsahuje zakázané slovo\"");
            valid = false;
        }


        // 3. Vaše libovolná podmínka

        if (password.equals(password.toLowerCase())) {
            System.out.println("Heslo nesplňuje jednu z podmínek: \"neobsahuje velké písmeno\"");
            valid = false;
        }

        if (valid){
            System.out.println("Heslo je v pořádku");
        }
    }

    public static void main(String[] args) {

        validatePassword("heslo123"); // Nesplňuje: obsahuje zakázané slovo
        validatePassword("Pepik1");   // Nesplňuje: délka hesla
        validatePassword("tornadro"); // Nesplňuje: neobsahuje velké písmeno
        validatePassword("Javasuper123");  // Splňuje
    }
}
