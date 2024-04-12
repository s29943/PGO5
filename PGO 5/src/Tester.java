public class Tester extends  Employee {
    public String FirstName;
    public String LastName;
    public String address;
    public String email;
    public String pesel;
    public int YearOfEmployment;



    public Tester(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        this.FirstName=firstName;
        this.LastName=lastName;
        this.address=address;
        this.email=email;
        this.pesel=pesel;
        this.YearOfEmployment=yearOfEmployment;
    }

    public void addTestType(String testType) {
    }
}

