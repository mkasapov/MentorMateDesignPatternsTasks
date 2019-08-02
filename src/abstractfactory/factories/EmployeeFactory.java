package abstractfactory.factories;

import abstractfactory.enums.Office;
import abstractfactory.simpleclasses.Employee;
import abstractfactory.enums.EmployeeType;

public class EmployeeFactory {

    private EmployeeFactory() {

    }

    public static Employee createEmployee(EmployeeType employeeType, Office office) {

        Employee employee = null;
        switch (office) {
            case SOFIA:
                employee = SofiaEmployeeFactory.createEmployee(employeeType);
                break;
            case VARNA:
                employee = VarnaEmployeeFactory.createEmployee(employeeType);
                break;
            case PLOVDIV:
                employee = PlovdivEmployeeFactory.createEmployee(employeeType);
                break;
        }
        return employee;
    }
}
