package abstractfactory.factories;

import abstractfactory.enums.EmployeeType;
import abstractfactory.enums.Office;
import abstractfactory.simpleclasses.*;

public class SofiaEmployeeFactory {

    public static Employee createEmployee(EmployeeType employeeType) {

        Employee employee = null;
        switch (employeeType) {
            case INTERN:
                employee = new Intern(Office.SOFIA);
                break;
            case JUNIOR:
                employee = new Junior(Office.SOFIA);
                break;
            case SENIOR:
                employee = new Senior(Office.SOFIA);
                break;
            case MANAGER:
                employee = new Manager(Office.SOFIA);
                break;
            default:
                throw new IllegalArgumentException("No such an employee!");
        }
        return employee;
    }
}
