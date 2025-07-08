package TPBillet.Entities;

//    - Evenement :
//        - nom
//        - lieu
//        - date
//        - heure
//        - nombre de place
//        - Liste de Billet


// 2. Gestion des Événements :
//
//- Pour chaque événement, il sera possible de récupérer la liste des billets associés.


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Event {
private String name;
private Venue venue;
private LocalDate date;
private LocalTime time;
private int totalSeats;
private List<Ticket> tickets;

public Event(String name, Venue venue, LocalDate date, LocalTime time, int totalSeats) {

    this.name = name;
    this.venue = venue;
    this.date = date;
    this.time = time;
    this.totalSeats = totalSeats;
    this.tickets = new ArrayList<>();

}

public String getName() {
    return name;
}

public Venue getVenue() {
    return venue;
}
public LocalDate getDate() {
    return date;
}
public LocalTime getTime() {
    return time;
}
public int getTotalSeats() {
    return totalSeats;
}
public List<Ticket> getTickets() {
    return tickets;
}
public void setName(String name) {
    this.name = name;
}
public void setVenue(Venue venue) {
    this.venue = venue;
}
public void setDate(LocalDate date) {
    this.date = date;
}
public void setTime(LocalTime time) {
    this.time = time;
}
public void setTotalSeats(int totalSeats) {
    this.totalSeats = totalSeats;
}
public void setTickets(List<Ticket> tickets) {
    this.tickets = tickets;
}

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    @Override
    public String toString() {
        return "Evenement { " +
                "Nom ='" + name + '\'' +
                ", Lieu =" + venue +
                ", Date =" + date +
                ", Heure =" + time +
                ", Total places = " + totalSeats +
                ", Billets vendus = " + tickets.size() +
                '}';
    }

    // Bonus : vérification si places disponibles
    public boolean hasAvailableSeats() {
        return tickets.size() < totalSeats;
    }


}
