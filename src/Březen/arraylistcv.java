package Březen;

import java.util.*;

public class arraylistcv {

    private static void printFoodList(ArrayList<String> foodList) {
        int len = foodList.size();
        System.out.println("- --  [ Váš seznam jídel] -- -");

        if (foodList.isEmpty()) {
            System.out.println("- -- ! Váš seznam je prázdný. ! -- -");
        }
        else {
            for (int i = 0; i < len; i++) {
                System.out.printf("- -> [%d] %s%n", i + 1, foodList.get(i));
            }
        }
        System.out.printf("- -- [ Počet položek: %d ] -- -%n%n", len);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<String> foodNames = new ArrayList<>();

        System.out.println("Přidávejte položky do seznamu, napsáním \"konec\" ukončíte vkládání.");
        while (true) {
            System.out.println("Přidat název položky: ");
            String userInput = scn.nextLine().trim();

            if (userInput.isEmpty()) {
                continue;
            }
            else if (userInput.equalsIgnoreCase("konec")) {
                break;
            }
            else if (!foodNames.contains(userInput)) {
                foodNames.add(userInput);
            }
        }

        printFoodList(foodNames);

        boolean doRemoveCycle = false;

        System.out.println("Přejete si odebrat nějakou položku? Zvolte A/N - [N]");
        String tempResponse = scn.nextLine().trim().toLowerCase();

        if (tempResponse.startsWith("a")) {
            doRemoveCycle = true;
        }

        if (doRemoveCycle) {
            System.out.println("Odebírejte položky ze seznamu napsáním jejich názvu, napsáním \"konec\" ukončíte odebírání.");

            while (!foodNames.isEmpty()) {
                printFoodList(foodNames);
                System.out.println("Odebrat položku: ");
                String userInput = scn.nextLine().trim();

                if (userInput.isEmpty()) {
                    continue;
                }
                else if (userInput.equalsIgnoreCase("konec")) {
                    break;
                }

                if (foodNames.contains(userInput)) {
                    foodNames.remove(userInput);
                    System.out.println("Položka byla odstraněna.");
                }
                else {
                    System.out.println("Položka nebyla nalezena.");
                }
            }
        }

        printFoodList(foodNames);
        scn.close();
    }
}
