package TPBillet.IHM;

import TPBillet.Entities.Customer;
import TPBillet.Entities.Event;
import TPBillet.Services.EventService;

import java.util.*;

public class IHM {
    private List<Customer> customers = new ArrayList<>();
    private List<Event> events = new ArrayList<>();
    private EventService eventService = new EventService();
    private ManageMenu manageMenu = new ManageMenu();
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
                    case 1 -> manageMenu.callSubMenu("adresse");
                    case 2 -> manageMenu.callSubMenu("localisation");
                    case 3 -> manageMenu.callSubMenu("évènement");
                    case 4 -> manageMenu.callSubMenu("client");
                    case 5 -> manageMenu.callSubMenu("ticket");
                    case 6 -> System.out.println("Au revoir.");
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
