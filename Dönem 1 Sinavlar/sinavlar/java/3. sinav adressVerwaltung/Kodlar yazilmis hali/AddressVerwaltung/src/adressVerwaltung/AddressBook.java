package adressVerwaltung;

import java.util.List;

public class AddressBook {
    private List<Company> companies;
    private List<Department> departments;
    private List<Person> persons;

    public void add(Person person) {
        persons.add(person);
    }
    public void add(Company company) {
        companies.add(company);
    }
    public void add(Department department) {
        departments.add(department);
    }
    public void printEmployees(Company company) {
        int count = 0;
        for (Person person : persons) {
            if (person.isEmployeeOf(company)) {
                System.out.println(person.getId() + ": " + person.getName() + "\n" +
                        "P: " + person.getAddress() + " (" + person.getAddress().getAccessCount() + ")");

                Department dept = person.getDepartment();
                if (dept.getAddress() != null) {
                    System.out.println("G: " + dept.getAddress() + " (" + dept.getAddress().getAccessCount() + ")");
                } else {

                    System.out.println("G: " + dept.getCompany().getAddress() + " (" + dept.getCompany().getAddress().getAccessCount() + ")");
                }

                count++;
            }
        }
        System.out.println("Anzahl gefundene Adressen: " + Address.getTotalAccessCount());
    }

    public static void print(Person person) {
        System.out.println(person.getName());
    }
    public static void print(Department department) {
        System.out.println(department.getName());
    }
    public static void print(Company company) {
        System.out.println(company.getName());
    }
}
