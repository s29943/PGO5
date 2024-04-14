import java.time.LocalDate;
import java.util.ArrayList;

public class Manager extends  Employee{
    public ArrayList<Goal> Goals;
    public Manager(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName,lastName,address,email,pesel,yearOfEmployment);
        this.FirstName=firstName;
        this.LastName=lastName;
        this.address=address;
        this.email=email;
        this.pesel=pesel;
        this.YearOfEmployment=yearOfEmployment;
    }

    public void addGoals(Goal goal) {
    }
    public int calculateSalary()  {
        int sallary=super.calculateSalary();
        LocalDate date=LocalDate.now();
        int year=date.getYear();
        int month=date.getMonthValue();
        int WorkingYeares = year - YearOfEmployment;

        for(int i=1; i<=WorkingYeares;i++){
            sallary+=1000;

            for( Goal goal: Goals){
                if(goal.year == year && goal.month==month) {
                    sallary += goal.bonus;
                }
            }
        }
        return sallary;
    }
}
