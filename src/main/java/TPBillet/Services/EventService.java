package TPBillet.Services;

import java.util.*;

public class EventService {
    private Scanner scanner = new Scanner(System.in);
    int choice = -1;
   public void EventSubMenu() {
       try {
           choice = Integer.parseInt(scanner.nextLine());

           switch (choice) {
               case 1 -> System.out.println("Option 1");
               case 2 -> System.out.println("Option 2");
               case 3 -> System.out.println("Option 3");
               case 4 -> System.out.println("Option 4 : modification à implémenter.");
               case 5 -> System.out.println("Option 5");
               default -> System.out.println("Choix invalide.");
           }
       }catch (Exception e){
           System.out.println("Erreur :" + e.getMessage());
       }

   }
}
