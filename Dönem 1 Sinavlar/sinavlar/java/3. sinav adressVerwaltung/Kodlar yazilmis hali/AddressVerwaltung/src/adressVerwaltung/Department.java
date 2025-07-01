package adressVerwaltung;

public class Department extends Entry{
    private Company company;

    public Department(String name, Address address, Company company) {
        super(name, address);
        this.company = company;
    }

    public Department(String name, Company company) {
        super(name, null);
        this.company = company;
    }

    public boolean isDepartmentOf(Company company) {
        return this.company == company;

    }

    public Company getCompany() {
        return company;
    }
}
