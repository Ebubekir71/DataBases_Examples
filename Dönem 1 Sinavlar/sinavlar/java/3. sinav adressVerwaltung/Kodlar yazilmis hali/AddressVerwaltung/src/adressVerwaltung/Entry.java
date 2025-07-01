package adressVerwaltung;

public abstract class Entry {
    private Address address;
    private String name;

    public Entry(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
