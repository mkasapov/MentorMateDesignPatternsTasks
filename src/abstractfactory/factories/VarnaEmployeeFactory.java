package abstractfactory.factories;

import abstractfactory.enums.EmployeeType;
import abstractfactory.enums.Office;
import abstractfactory.simpleclasses.*;

public class VarnaEmployeeFactory {

    public static Employee createEmployee(EmployeeType employeeType) {

        Employee employee = null;
        switch (employeeType) {
            case INTERN:
                employee = new Intern(Office.VARNA);
                break;
            case JUNIOR:
                employee = new Junior(Office.VARNA);
                break;
            case SENIOR:
                employee = new Senior(Office.VARNA);
                break;
            case MANAGER:
                employee = new Manager(Office.VARNA);
                break;
            default:
                throw new IllegalArgumentException("No such an employee!");
        }
        return employee;
    }
}
