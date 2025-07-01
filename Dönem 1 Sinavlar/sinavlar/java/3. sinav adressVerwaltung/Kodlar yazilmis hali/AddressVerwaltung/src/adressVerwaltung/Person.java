package adressVerwaltung;

public class Person extends Entry{
    private int id;
    private Department department;

    public Person(int id, String name, Address address, Department department) {
        super(name, address);
        this.id = id;
        this.department = department;
    }

    public Person(int id, String name, Department department) {
        super(name, null);
        this.id = id;
        this.department = department;
    }

    public boolean isEmployeeOf(Company company) {
        return department != null && department.isDepartmentOf(company);
    }

    public int getId() {
        return id;
    }

    public Department getDepartment() {
        return department;
    }
}
