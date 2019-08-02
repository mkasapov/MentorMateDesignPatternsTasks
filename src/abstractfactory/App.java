package abstractfactory;

import abstractfactory.enums.EmployeeType;
import abstractfactory.enums.Office;
import abstractfactory.factories.EmployeeFactory;

public class App {
    public static void main(String[] args) {
        System.out.println(EmployeeFactory.createEmployee(EmployeeType.JUNIOR, Office.SOFIA));
        System.out.println();
        System.out.println(EmployeeFactory.createEmployee(EmployeeType.INTERN, Office.PLOVDIV));
        System.out.println();
        System.out.println(EmployeeFactory.createEmployee(EmployeeType.SENIOR, Office.VARNA));
        System.out.println();
    }
}
