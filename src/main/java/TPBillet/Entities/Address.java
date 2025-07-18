package TPBillet.Entities;

//    - adresse
//        - rue
//        - ville

public class Address {
    protected String street;
    protected String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return street + ", " + city;
    }
}
