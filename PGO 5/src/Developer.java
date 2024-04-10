import java.util.ArrayList;

public class Developer extends Employee{
    public String FirstName;
    public String LastName;
    public String address;
    public String email;
    public String pesel;
    public int YearOfEmployment;
    public ArrayList<Technology> technologies;
    public Developer(String FirstName, String LastName, String address, String email, String pesel, int yearOfEmployment) {
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.address=address;
        this.email=email;
        this.pesel=pesel;
        this.YearOfEmployment=yearOfEmployment;



    }
    public void addTechnology(Technology technology){


    }
}
