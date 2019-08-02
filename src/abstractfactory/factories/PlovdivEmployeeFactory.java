package abstractfactory.factories;

import abstractfactory.enums.EmployeeType;
import abstractfactory.enums.Office;
import abstractfactory.simpleclasses.*;

public class PlovdivEmployeeFactory {
    public static Employee createEmployee(EmployeeType employeeType) {

        Employee employee = null;
        switch (employeeType) {
            case INTERN:
                employee = new Intern(Office.PLOVDIV);
                break;
            case JUNIOR:
                employee = new Junior(Office.PLOVDIV);
                break;
            case SENIOR:
                employee = new Senior(Office.PLOVDIV);
                break;
            case MANAGER:
                employee = new Manager(Office.PLOVDIV);
                break;
            default:
                throw new IllegalArgumentException("No such an employee!");
        }
        return employee;
    }
}
