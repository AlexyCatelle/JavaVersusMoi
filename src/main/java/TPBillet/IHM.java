package TPBillet;

import TPBillet.Entities.Customer;
import TPBillet.Entities.Ticket;
import TPBillet.Entities.Event;

import java.util.*;

public class IHM {
    private List<Customer> customers = new ArrayList<>();
    private List<Event> events = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void start (){
        int choice = -1;
        while (choice != 6) {
            System.out.println("\n====== Menu Principal ======");
            System.out.println("1 => Gérer les Adresses");
            System.out.println("2 => Gérer les Lieux");
            System.out.println("3 => Gérer les Événements");
            System.out.println("4 => Gérer les Clients");
            System.out.println("5 => Gérer les Tickets");
            System.out.println("6 => Quitter");
            System.out.print("Votre choix : ");

            try {
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1 -> System.out.println("Option 1");
                    case 2 -> System.out.println("Option 2");
                    case 3 -> manageEvents();
                    case 4 -> System.out.println("Option 4");
                    case 5 -> System.out.println("Option 5");
                    case 6 -> System.out.println("Option 6");
                    default -> System.out.println("Choix invalide.");
                }
            }catch (Exception e){
                System.out.println("Erreur :" + e.getMessage());
            }
        }
    }

    public void manageEvents(){
        int choice = -1;
        while (choice != 5) {
        System.out.println("\n-- GESTION DES EVENEMENTS --");
        System.out.println("1. Lister les événements.");
        System.out.println("2. Créer un événement.");
        System.out.println("3. Modifier un événement.");
        System.out.println("4. Supprimer un événement.");
        System.out.println("5. Retour");

        try {
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> System.out.println("Option 1");
                case 2 -> System.out.println("Option 2");
                case 3 -> System.out.println("Option 3");
                case 4 -> System.out.println("Option 4");
                case 5 -> System.out.println("Option 5");
                default -> System.out.println("Choix invalide.");
            }
        }catch (Exception e){
            System.out.println("Erreur :" + e.getMessage());
        }
    }
    }

    public static void main(String[] args) {
        IHM ihm = new IHM();
        ihm.start();
    }

}
