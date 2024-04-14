import java.util.ArrayList;

public class Employee {
    public String FirstName;
    public String LastName;
    public String address;
    public String email;
    public String pesel;
    public int YearOfEmployment;
    public int salary;
    public ArrayList<Employee> employees;

    public Employee(String name, String LastName,String address, String email, String pesel,int YearOfEmployment) {
        this.FirstName = name;
        this.LastName = LastName;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.YearOfEmployment = YearOfEmployment;
    }

    public int calculateSalary() {
        int sallary=3000;
        return salary;

    }
}
