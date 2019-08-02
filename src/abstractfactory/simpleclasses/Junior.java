package abstractfactory.simpleclasses;

import abstractfactory.enums.EmployeeType;
import abstractfactory.enums.Office;

public class Junior extends Employee {

    public Junior(Office office){
        super(EmployeeType.JUNIOR, office);
        createEmp();
    }

    @Override
    protected void createEmp() {
        System.out.println("Junior created!");
        System.out.println("Minimal Christmas bonus for juniors!");
    }
}
