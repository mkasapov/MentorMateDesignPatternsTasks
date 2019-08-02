package abstractfactory.simpleclasses;

import abstractfactory.enums.EmployeeType;
import abstractfactory.enums.Office;

public class Intern extends Employee {

   public Intern(Office office){
        super(EmployeeType.INTERN, office);
        createEmp();
    }


    @Override
    protected void createEmp() {
        System.out.println("Intern created!");
        System.out.println("No Christmas bonus for interns!");
    }
}
