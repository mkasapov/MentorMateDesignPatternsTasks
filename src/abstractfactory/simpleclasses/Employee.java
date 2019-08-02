package abstractfactory.simpleclasses;

import abstractfactory.enums.EmployeeType;
import abstractfactory.enums.Office;

public abstract class Employee {

    private EmployeeType employeeType = null;
    private Office office=null;

    public Employee(EmployeeType employeeType, Office office) {
        this.employeeType = employeeType;
        this.office=office;
        officeInfo(this.office);
        christmasBonus();

    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public void christmasBonus(){
        System.out.println("Calculating Christmas bonus...");
    }
    public void officeInfo(Office office){
        System.out.printf("Merry Christmas %s\n",office);
    }

    protected abstract void createEmp();



}
