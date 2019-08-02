package abstractfactory.simpleclasses;

import abstractfactory.enums.EmployeeType;
import abstractfactory.enums.Office;

public class Senior extends Employee {

    public Senior(Office office){
        super(EmployeeType.JUNIOR, office);
        createEmp();
    }

    @Override
    protected void createEmp() {
        System.out.println("Senior created!");
        System.out.println("Medium Christmas bonus for seniors!");
    }
}
