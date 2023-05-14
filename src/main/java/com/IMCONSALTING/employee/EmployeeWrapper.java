package com.IMCONSALTING.employee;

public class EmployeeWrapper {
    private final Employee employee;

    //DI Dependency Injection

    public EmployeeWrapper(Employee employee) {
        this.employee = employee;
    }

    public Object getColumValue(int index) {
        switch (index) {
            case 0:
                return employee.getId();
            case 1:
                return employee.getName();
            case 2:
                return employee.getSurname();
        }
        return null;
    }

    public void setColumnValue(Object aValue,int index) {
        switch (index) {
            case 1:
                employee.setName((String) aValue);
                break;
            case 2:
                employee.setSurname((String) aValue);
                break;
        }
    }
}
