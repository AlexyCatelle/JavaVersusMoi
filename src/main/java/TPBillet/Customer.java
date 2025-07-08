package TPBillet;

//   - Client :
//     - nom
//     - prenom
//     - adresse
//     - age
//     - numeros de telephone
//     - Liste de Billet

import java.util.List;
import java.util.ArrayList;

public class Customer {
private String firstName;
private String lastName;
private Address address;
private int age;
private String phone;
private List<Ticket> tickets;

public Customer(String firstName, String lastName, Address address, int age, String phone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.age = age;
    this.phone = phone;
    this.tickets = new ArrayList<>();
}


public String getFirstName() {
    return firstName;
}
public String getLastName() {
    return lastName;
}
public Address getAddress() {
    return address;
}
public int getAge() {
    return age;
}
public String getPhone() {
    return phone;
}
public List<Ticket> getTickets() {
    return tickets;
}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
    this.lastName = lastName;
    }

    public void setAddress(Address address) {
    this.address = address;
    }

    public void setAge(int age) {
    this.age = age;
    }

    public void setPhone(String phone) {
    this.phone = phone;
    }

    public void setTickets(List<Ticket> tickets) {
    this.tickets = tickets;
    }

    public void addTicket(Ticket ticket) {
    this.tickets.add(ticket);
    }

    @Override
    public String toString() {
        return "Client { " +
                "Nom = '" + firstName + " " + lastName + '\'' +
                ", Adresse = " + address +
                ", Age = " + age +
                ", Telephone = '" + phone + '\'' +
                ", Tickets = " + tickets.size() +
                '}';
    }

}

