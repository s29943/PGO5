import java.time.LocalDate;
import java.util.ArrayList;

public class Tester extends  Employee {
    public ArrayList<TestType> testTypes;


    public Tester(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName,lastName,address,email,pesel,yearOfEmployment);
        this.FirstName=firstName;
        this.LastName=lastName;
        this.address=address;
        this.email=email;
        this.pesel=pesel;
        this.YearOfEmployment=yearOfEmployment;
    }

    public void addTestType(String testType) {
    }
    public int calculateSalary()  {
        int sallary=3000;
        LocalDate date=LocalDate.now();
        int year=date.getYear();
        int WorkingYeares = year - YearOfEmployment;
        for(int i=1; i<=WorkingYeares;i++){
            sallary+=1000;

            for(TestType testType: testTypes){
                sallary+=300;
            }
        }
        return sallary;
    }
}

