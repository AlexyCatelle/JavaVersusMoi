package TPBillet.Entities;

//   - billet :
//        - numeros de place
//        - client
//        - Evenement
//        - type de place (standar , gold, vip)

import TPBillet.Enums.SeatType;

public class Ticket {
private String seatNumber;
private Customer customer;
private Event event;
private SeatType seatType;
private double price;

public Ticket(String seatNumber, Customer customer, Event event, SeatType seatType, double price) {
    this.seatNumber = seatNumber;
    this.customer = customer;
    this.event = event;
    this.seatType = seatType;
    this.price = price;

}
public String getSeatNumber() {
    return seatNumber;
}
public Customer getCustomer() {
    return customer;
}
public Event getEvent() {
    return event;
}
public SeatType getSeatType() {
    return seatType;
}

public double getPrice() {
    return price;
}

public void setSeatNumber(String seatNumber) {
    this.seatNumber = seatNumber;
}

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setEvent(Event event) {
    this.event = event;
    }

    public void setSeatType(SeatType seatType) {
    this.seatType = seatType;
    }
    public void setPrice(double price) {
    this.price = price;
    }
}
