import java.util.ArrayList;

public class Manager extends  Employee{
    public String FirstName;
    public String LastName;
    public String address;
    public String email;
    public String pesel;
    public int YearOfEmployment;
    public ArrayList<Goal> Goals;
    public Manager(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super();
        this.FirstName=firstName;
        this.LastName=lastName;
        this.address=address;
        this.email=email;
        this.pesel=pesel;
        this.YearOfEmployment=yearOfEmployment;
    }

    public void addGoals(Goal goal) {
    }
}
