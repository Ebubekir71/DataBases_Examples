package adressVerwaltung;

public class Address {
    private String street;
    private String city;
    private int accessCount =0;
    private static int totalAccessCount = 0;

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

    public int getAccessCount() {
        return accessCount;
    }

    public static int getTotalAccessCount() {
        return totalAccessCount;
    }

    @Override
    public String toString() {
        accessCount++;
        totalAccessCount++;
        return street + ", " + city;
    }

}
