package TPBillet.Entities;

//    - Lieu (herite de adresse) :
//        - capacité
public class Venue extends Address {
    private int capacity;

    public Venue(String street, String city, int capacity) {
        super(street, city);
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + " - Capacité : " + capacity;
    }
}
