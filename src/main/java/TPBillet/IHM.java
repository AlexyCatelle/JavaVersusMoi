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
        System.out.println("Menu : \n 1 => Créer nouvel évènement. \n 2 => Voir les évènements.");
    int choice = scanner.nextInt();

    try {
        switch (choice) {
            case 1 -> System.out.println("Option 1");
            case 2 -> System.out.println("Option 2");
        }
    }catch (Exception e){
        System.out.println("Erreur :" + e.getMessage());
    }
    }

    public static void main(String[] args) {
        IHM ihm = new IHM();
        ihm.start();
    }

}
