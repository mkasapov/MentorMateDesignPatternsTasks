package abstractfactory.simpleclasses;

import abstractfactory.enums.EmployeeType;
import abstractfactory.enums.Office;

public class Manager extends Employee {

    public Manager(Office office){
        super(EmployeeType.MANAGER, office);
        createEmp();
    }

    @Override
    protected void createEmp() {
        System.out.println("Manager created!");
        System.out.println("Decent Christmas bonus for managers!");
    }
}
