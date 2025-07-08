package TPBillet.IHM;

import java.util.Scanner;

public class ManageMenu {
    public String selection;
    private Scanner scanner = new Scanner(System.in);

    public void callSubMenu(String selection){
        int choice = -1;
        while (choice != 5) {
            System.out.println("\n-- Gestion des " + selection + " --");
            System.out.println("1. Lister les " + selection + "s.");
            System.out.println("2. Créer un(e) " + selection + ".");
            System.out.println("3. Modifier un(e) " + selection + ".");
            System.out.println("4. Supprimer un(e) " + selection + ".");
            System.out.println("5. Retour au menu principal.");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println("Choix incorrect.");
            }
        }
    }
}
