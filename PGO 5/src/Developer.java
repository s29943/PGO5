import java.time.LocalDate;
import java.util.ArrayList;


public class Developer extends Employee {

    public ArrayList<Technology> technologies;

    public Developer(String FirstName, String LastName, String address, String email, String pesel, int yearOfEmployment) {
        super(FirstName,LastName,address,email,pesel,yearOfEmployment );
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.YearOfEmployment = yearOfEmployment;

    }

    public void addTechnology(Technology technology) {

    }

    public int calculateSalary()  {
        int sallary=super.calculateSalary();
        LocalDate date=LocalDate.now();
        int year=date.getYear();
        int WorkingYeares = year - YearOfEmployment;
        for(int i=1; i<=WorkingYeares;i++){
            sallary+=1000;

             for( Technology technology: technologies){
                 sallary+=technology.bonus;
             }
        }
        return sallary;
    }

}
