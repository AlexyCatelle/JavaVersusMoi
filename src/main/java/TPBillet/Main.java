package TPBillet;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import TPBillet.Entities.*;
import TPBillet.Enums.SeatType;


public class Main {

    public static void main(String[] args) {
        // Test sans IHM
        try {

            List<Customer> customers = new ArrayList<>();
            List<Event> events = new ArrayList<>();

  //          try {

                Address adressCustomerTest = new Address("42 Rue Principale", "Paris");
                Customer customerTest = new Customer("Dupont", "Marie", adressCustomerTest,30,"060606060606");
                customers.add(customerTest);
                System.out.println(customerTest.toString());

 //           }catch (Exception e){
 //               System.out.println("Erreur lors de la création du client" + e.getMessage());
 //           }

//            try {

                Venue venueTest = new Venue("Transbordeur", "Lyon", 3500);
                Event eventTest = new Event("Concert Wind Rose", venueTest, LocalDate.of(2025, 10, 17),LocalTime.of(19,0), venueTest.getCapacity());
                events.add(eventTest);
                System.out.println(eventTest.toString());

//            } catch (Exception e) {
//                System.out.println("Erreur lors de la création de l'evenement" + e.getMessage());
//            }

            try {
                Ticket ticketTest1 = new Ticket("B118",customerTest,eventTest, SeatType.VIP,217);
                System.out.println("Ticket réservé ");
            }catch (Exception e){
                System.out.println("Erreur lors de la création du ticket test 1 " + e.getMessage());
            }

        }catch (Exception e) {
            System.out.println("Erreur globale lors du test" + e.getMessage());
        }

    }
}
