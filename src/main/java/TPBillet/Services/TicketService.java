package TPBillet.Services;

// 1. Réservation de Billets :
//- Nos clients pourront réserver des billets pour différents événements, et chaque billet sera lié à un événement.

import TPBillet.Entities.Customer;
import TPBillet.Entities.Event;
import TPBillet.Enums.SeatType;
import TPBillet.Entities.Ticket;
import TPBillet.Exceptions.EventFull;

public class TicketService {

    public static Ticket buyTicket (Customer customer, Event event, String seatNumber, SeatType seatType, double price) throws Exception {
if(!event.hasAvailableSeats()){
    throw new EventFull("Evènement complet.");
}
Ticket ticket = new Ticket(seatNumber, customer, event, seatType, price);{
    customer.addTicket(ticket);
    event.addTicket(ticket);
    return ticket;
}
    }
}
